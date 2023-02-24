package io.fp.bmiCalculatorFX.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import io.fp.bmiCalculatorFX.model.HealthCheck;

public class BMIClaculatorImpl implements BMICalculatorDAO {
	private File storeFile;

	public BMIClaculatorImpl(String fileName) {
		this.storeFile = new File(fileName);
	}

	@Override
	public HealthCheck createStore() throws IOException {
		if (!storeFile.exists()) {
			try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(storeFile))) {
				HealthCheck healthcheck = new HealthCheck();
				s.writeObject(healthcheck);
				return healthcheck;
			}
		} else {
			throw new IOException("Store already exists!");
		}
	}

	@Override
	public HealthCheck readStore() throws IOException {
		if (!storeFile.exists()) {
			throw new IOException("Store does not exist!");
		}

		try (ObjectInputStream s = new ObjectInputStream(new FileInputStream(storeFile))) {
			HealthCheck healthcheck = null;
			try {
				healthcheck = (HealthCheck) s.readObject();
			} catch (ClassNotFoundException ex) {
				throw new IOException("File contains no store!");
			}
			if (healthcheck == null)
				throw new IOException("File is empty!");
			return healthcheck;
		}
	}

	@Override
	public void updateStore(HealthCheck healthcheck) throws IOException {
		try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(storeFile))) {
			s.writeObject(healthcheck);
		}
	}

	@Override
	public void deleteStore() throws IOException {
		if (!storeFile.exists())
			throw new IOException("Store does not exist!");
		storeFile.delete();
	}

}

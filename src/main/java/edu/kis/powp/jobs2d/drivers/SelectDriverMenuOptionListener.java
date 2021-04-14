package edu.kis.powp.jobs2d.drivers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectDriverMenuOptionListener implements ActionListener {
	private DriverManager driverManager;
	private IVisitableDriver driver = null;

	public SelectDriverMenuOptionListener(IVisitableDriver driver, DriverManager driverManager) {
		this.driverManager = driverManager;
		this.driver = driver;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		driverManager.setCurrentDriver(driver);
	}
}

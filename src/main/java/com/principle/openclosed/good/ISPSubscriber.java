package com.principle.openclosed.good;

import java.util.List;

public class ISPSubscriber extends Subscriber {

	private long freeUsage;

	public ISPSubscriber() {

	}

	// Open for Modification
	@Override
	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}

	public long getFreeUsage() {
		return freeUsage;
	}

	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}

}

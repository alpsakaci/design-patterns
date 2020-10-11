package com.alpsakaci.designpatterns.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> services;

	public Cache() {
		services = new ArrayList<Service>();
	}

	public Service getService(String serviceName) {
		for (Service service : services) {
			if (service.getName().equalsIgnoreCase(serviceName)) {
				System.out.println("Returning from cache: " + serviceName);
				return service;
			}
		}

		return null;
	}

	public void addService(Service service) {
		if (!services.contains(service)) {
			services.add(service);
		}
	}

}

package taxi.service;

import taxi.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Driver findByLogin(String login);
}

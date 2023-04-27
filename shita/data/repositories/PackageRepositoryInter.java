package shita.data.repositories;

import shita.data.model.Package;

import java.util.List;

public interface PackageRepositoryInter {
    Package save(Package aPackage);
    void delete(Package aPackage);
    void   deleteId(int id);
    List<Package> findAll();
    Package findById(int id);
    long lastIdCreated();
    void deleteAll();

}

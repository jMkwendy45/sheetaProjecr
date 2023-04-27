package shita.data.repositories;

import shita.data.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImpl implements PackageRepositoryInter {
    private  int lastIdCreated;
    private List<Package>packages = new ArrayList<>();
    @Override
    public Package save(Package aPackage) {
        boolean isSaved = aPackage.getId() != 0;
        if (isSaved)
            update(aPackage);
        else {
            saveNew(aPackage);

        }
        return  aPackage;
    }
    private void update(Package aPackage)  {
      Package savedPackage = findById(aPackage.getId());
       int indexOfSaved = packages.indexOf(savedPackage);
       packages.set(indexOfSaved,aPackage);

        }

        private void saveNew(Package aPackage){
            aPackage.setId(generatePackageId());
            packages.add(aPackage);
            lastIdCreated++;

    }
     private  int generatePackageId(){
        return lastIdCreated +1;
     }
    @Override
    public void delete(Package aPackage) {
        packages.remove(aPackage);


    }

    @Override
    public void deleteId(int id) {
        Package foundPackage = findById(id);
        delete(foundPackage);
        lastIdCreated++;
    }
    @Override
    public List<Package> findAll() {

        return packages;
    }

    @Override
    public Package findById(int id) {
        for (Package aPackage : packages)
            if (aPackage.getId() ==id) return  aPackage;
        return null;
    }
    public long lastIdCreated(){
      return  packages.size();
    }

    @Override
    public void deleteAll() {
        packages.clear();

    }
}

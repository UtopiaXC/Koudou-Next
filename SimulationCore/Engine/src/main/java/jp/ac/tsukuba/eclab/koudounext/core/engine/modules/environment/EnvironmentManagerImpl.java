package jp.ac.tsukuba.eclab.koudounext.core.engine.modules.environment;

import jp.ac.tsukuba.eclab.koudounext.core.engine.modules.IModuleManager;

public class EnvironmentManagerImpl implements IModuleManager {

    @Override
    public boolean load() {
        //TODO: loader for environment config
        return true;
    }

    @Override
    public boolean step() {
        return false;
    }

    @Override
    public boolean preStep() {
        return false;
    }

    @Override
    public boolean conflictStep() {
        return false;
    }

    @Override
    public boolean postStep() {
        return false;
    }
}

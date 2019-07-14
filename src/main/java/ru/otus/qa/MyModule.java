package ru.otus.qa;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class MyModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UUIDGenerator.class).toInstance(new UUIDGenerator());

        bind(IRandomGenerator.class).annotatedWith(TestEnvironment.class)
                .to(RandomGenerator.class).in(Scopes.SINGLETON);
        bind(IRandomGenerator.class).annotatedWith(PreprodEnvironment.class)
                .to(SuperRandomGenerator.class).in(Scopes.SINGLETON);
    }
}

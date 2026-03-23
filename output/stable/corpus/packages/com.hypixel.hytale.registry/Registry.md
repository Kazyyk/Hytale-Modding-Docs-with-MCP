# Registry

Type: class | Package: com.hypixel.hytale.registry

public abstract class Registry<T>

## Fields

- private final BooleanSupplier precondition
- private final String preconditionMessage
- private final Registry.RegistrationWrapFunction<T> wrappingFunction
- private final List<BooleanConsumer> registrations
- private final List<BooleanConsumer> unmodifiableRegistrations
- private boolean enabled

## Methods

- protected void checkPrecondition()
- public boolean isEnabled()
- public void enable()
- public void shutdown()
- public void shutdownAndCleanup(boolean shutdown)
- public T register(T registration)
- @Nonnull public List<BooleanConsumer> getRegistrations()
- @Nonnull @Override public String toString()

## Inner Types

- `Registry.RegistrationWrapFunction`

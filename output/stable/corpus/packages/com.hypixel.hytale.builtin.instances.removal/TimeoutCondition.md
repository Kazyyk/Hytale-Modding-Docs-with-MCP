# TimeoutCondition

Type: class | Package: com.hypixel.hytale.builtin.instances.removal | Implements: RemovalCondition

public class TimeoutCondition implements RemovalCondition

Implementation of `RemovalCondition`.

## Constructors

- TimeoutCondition() | Creates a new TimeoutCondition instance.
- TimeoutCondition(double timeoutSeconds) | Creates a new TimeoutCondition instance.

## Methods

- getTimeoutSeconds() | double | public method.
- shouldRemoveWorld(@Nonnull Store<ChunkStore> store) | boolean | public method.

Also in this package: IdleTimeoutCondition, InstanceDataResource, RemovalCondition, RemovalSystem, WorldEmptyCondition

Complete API:
  public double getTimeoutSeconds()
  public boolean shouldRemoveWorld(Store<ChunkStore> store)

Fields:
public static final BuilderCodec<TimeoutCondition> CODEC
private double timeoutSeconds

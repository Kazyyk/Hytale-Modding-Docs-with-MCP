# WorldEmptyCondition

Type: class | Package: com.hypixel.hytale.builtin.instances.removal | Implements: RemovalCondition

public class WorldEmptyCondition implements RemovalCondition

Implementation of `RemovalCondition`.

## Fields

- REMOVE_WHEN_EMPTY | RemovalCondition[] | Static final RemovalCondition[] field.

## Constructors

- WorldEmptyCondition() | Creates a new WorldEmptyCondition instance.
- WorldEmptyCondition(double timeoutSeconds) | Creates a new WorldEmptyCondition instance.

## Methods

- shouldRemoveWorld(@Nonnull Store<ChunkStore> store) | boolean | public method.

Also in this package: IdleTimeoutCondition, InstanceDataResource, RemovalCondition, RemovalSystem, TimeoutCondition

Complete API:
  public boolean shouldRemoveWorld(Store<ChunkStore> store)

Fields:
public static final WorldEmptyCondition INSTANCE
public static final RemovalCondition[] REMOVE_WHEN_EMPTY
public static final BuilderCodec<WorldEmptyCondition> CODEC
private double timeoutSeconds

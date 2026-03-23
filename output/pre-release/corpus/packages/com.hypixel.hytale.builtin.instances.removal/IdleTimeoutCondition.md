# IdleTimeoutCondition

Type: class | Package: com.hypixel.hytale.builtin.instances.removal | Implements: RemovalCondition

public class IdleTimeoutCondition implements RemovalCondition

Implementation of `RemovalCondition`.

## Methods

- shouldRemoveWorld(@Nonnull Store<ChunkStore> store) | boolean | public method.

Also in this package: InstanceDataResource, RemovalCondition, RemovalSystem, TimeoutCondition, WorldEmptyCondition

Complete API:
  public boolean shouldRemoveWorld(Store<ChunkStore> store)

Fields:
public static final BuilderCodec<IdleTimeoutCondition> CODEC
private double timeoutSeconds

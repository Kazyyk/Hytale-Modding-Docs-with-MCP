# RemovalCondition

Type: interface | Package: com.hypixel.hytale.builtin.instances.removal

public interface RemovalCondition

Interface defining: `shouldRemoveWorld()`.

## Fields

- EMPTY | RemovalCondition[] | RemovalCondition[] field.

## Methods

- shouldRemoveWorld(@Nonnull Store<ChunkStore> var1) | boolean | package-private method.

Known implementors: IdleTimeoutCondition, PortalRemovalCondition, TimeoutCondition, WorldEmptyCondition

Also in this package: IdleTimeoutCondition, InstanceDataResource, RemovalSystem, TimeoutCondition, WorldEmptyCondition

Complete API:
  boolean shouldRemoveWorld(Store<ChunkStore> var1)

Fields:
CodecMapCodec<RemovalCondition> CODEC
RemovalCondition[] EMPTY

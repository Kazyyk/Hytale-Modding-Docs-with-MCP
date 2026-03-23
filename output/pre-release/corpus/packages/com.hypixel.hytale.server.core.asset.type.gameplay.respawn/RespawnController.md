# RespawnController

Type: interface | Package: com.hypixel.hytale.server.core.asset.type.gameplay.respawn

public interface RespawnController

## Fields

- CodecMapCodec<RespawnController> CODEC

## Methods

- CompletableFuture<Void> respawnPlayer(World var1, Ref<EntityStore> var2, ComponentAccessor<EntityStore> var3)

Known implementors: ExitInstance, HomeOrSpawnPoint, WorldSpawnPoint

Also in this package: HomeOrSpawnPoint, WorldSpawnPoint

Complete API:
  CompletableFuture<Void> respawnPlayer(World var1, Ref<EntityStore> var2, ComponentAccessor<EntityStore> var3)

Fields:
CodecMapCodec<RespawnController> CODEC

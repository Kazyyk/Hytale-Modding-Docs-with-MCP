# ISpawnProvider

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.spawn

public interface ISpawnProvider

## Fields

- BuilderCodecMapCodec<ISpawnProvider> CODEC

## Methods

- default Transform getSpawnPoint(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Deprecated default Transform getSpawnPoint(@Nonnull Entity entity)
- Transform getSpawnPoint(@Nonnull World var1, @Nonnull UUID var2)
- @Deprecated Transform[] getSpawnPoints()
- boolean isWithinSpawnDistance(@Nonnull Vector3d var1, double var2)

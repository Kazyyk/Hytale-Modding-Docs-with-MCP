# ExitInstance

Type: class | Package: com.hypixel.hytale.builtin.instances.config | Implements: RespawnController

public class ExitInstance implements RespawnController

## Fields

- @Nonnull public static final BuilderCodec<ExitInstance> CODEC
- @Nonnull private RespawnController fallback

## Methods

- @Override public CompletableFuture<Void> respawnPlayer(@Nonnull World world, @Nonnull Ref<EntityStore> playerReference, @Nonnull ComponentAccessor<EntityStore> commandBuffer)

Also in this package: InstanceDiscoveryConfig, InstanceEntityConfig, InstanceWorldConfig, WorldReturnPoint

Complete API:
  public CompletableFuture<Void> respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)

Fields:
public static final BuilderCodec<ExitInstance> CODEC
private RespawnController fallback

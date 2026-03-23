# ExitInstance

Type: class | Package: com.hypixel.hytale.builtin.instances.config | Implements: RespawnController

public class ExitInstance implements RespawnController

## Fields

- @Nonnull public static final BuilderCodec<ExitInstance> CODEC
- @Nonnull private RespawnController fallback

## Methods

- @Override public CompletableFuture<Void> respawnPlayer(@Nonnull World world, @Nonnull Ref<EntityStore> playerReference, @Nonnull ComponentAccessor<EntityStore> commandBuffer)

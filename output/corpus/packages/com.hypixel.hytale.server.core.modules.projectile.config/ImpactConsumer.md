# ImpactConsumer

Type: interface | Package: com.hypixel.hytale.server.core.modules.projectile.config

public interface ImpactConsumer

Functional interface invoked when a projectile impacts a surface or entity. Receives the projectile reference, impact position, optional target entity reference, collision detail name, and command buffer.

## Methods

- public void onImpact(@Nonnull Ref<EntityStore> var1, @Nonnull Vector3d var2, @Nullable Ref<EntityStore> var3, @Nullable String var4, @Nonnull CommandBuffer<EntityStore> var5)

# Motion

Type: interface | Package: com.hypixel.hytale.server.npc.instructions | Extends: RoleStateChange, IAnnotatedComponent

public interface Motion extends RoleStateChange, IAnnotatedComponent

## Methods

- void preComputeSteering(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider provider, @Nonnull Store<EntityStore> store)
- void activate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- void deactivate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- boolean computeSteering( @Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Steering var6, @Nonnull ComponentAccessor<EntityStore> var7 )

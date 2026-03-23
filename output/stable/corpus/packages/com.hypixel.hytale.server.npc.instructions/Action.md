# Action

Type: interface | Package: com.hypixel.hytale.server.npc.instructions | Extends: RoleStateChange, IAnnotatedComponent, IComponentExecutionControl

public interface Action extends RoleStateChange, IAnnotatedComponent, IComponentExecutionControl

## Methods

- boolean canExecute(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Store<EntityStore> var6)
- boolean execute(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Store<EntityStore> var6)
- void activate(Role var1, InfoProvider var2)
- void deactivate(Role var1, InfoProvider var2)
- boolean isActivated()

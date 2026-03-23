# IAttitudeProvider

Type: interface | Package: com.hypixel.hytale.server.npc.blackboard.view.attitude

public interface IAttitudeProvider

Defines the contract for IAttitudeProvider operations. Determines the attitude of one entity toward another based on role context.

## Constants

- static final int OVERRIDE_PRIORITY

## Methods

- Attitude getAttitude(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nonnull Ref<EntityStore> var3, @Nonnull ComponentAccessor<EntityStore> var4)

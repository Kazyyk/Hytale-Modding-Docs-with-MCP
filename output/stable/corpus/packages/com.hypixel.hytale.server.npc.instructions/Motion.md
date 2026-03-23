# Motion

Type: interface | Package: com.hypixel.hytale.server.npc.instructions | Extends: RoleStateChange, IAnnotatedComponent

public interface Motion extends RoleStateChange, IAnnotatedComponent

## Methods

- void preComputeSteering(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nullable InfoProvider provider, @Nonnull Store<EntityStore> store)
- void activate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- void deactivate(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- boolean computeSteering( @Nonnull Ref<EntityStore> var1, @Nonnull Role var2, @Nullable InfoProvider var3, double var4, @Nonnull Steering var6, @Nonnull ComponentAccessor<EntityStore> var7 )

Known implementors: BodyMotion, HeadMotion, MotionBase

Also in this package: Action, ActionList, BodyMotion, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, NullSensor, RoleStateChange, Sensor

Complete API:
  default void preComputeSteering(Ref<EntityStore> ref, Role role, InfoProvider provider, Store<EntityStore> store)
  default void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  default void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  boolean computeSteering(Ref<EntityStore> var1, Role var2, InfoProvider var3, double var4, Steering var6, ComponentAccessor<EntityStore> var7)

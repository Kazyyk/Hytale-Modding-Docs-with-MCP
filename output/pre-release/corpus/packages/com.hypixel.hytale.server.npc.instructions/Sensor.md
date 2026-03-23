# Sensor

Type: interface | Package: com.hypixel.hytale.server.npc.instructions | Extends: RoleStateChange, IAnnotatedComponent, IComponentExecutionControl

public interface Sensor extends RoleStateChange, IAnnotatedComponent, IComponentExecutionControl

## Methods

- boolean matches(@Nonnull Ref<EntityStore> var1, @Nonnull Role var2, double var3, @Nonnull Store<EntityStore> var5)
- void done()
- @Nullable InfoProvider getSensorInfo()

Known implementors: NullSensor, SensorBase

Also in this package: Action, ActionList, BodyMotion, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, Motion, NullSensor, RoleStateChange

Complete API:
  boolean matches(Ref<EntityStore> var1, Role var2, double var3, Store<EntityStore> var5)
  default void done()
  InfoProvider getSensorInfo()

Fields:
Sensor NULL

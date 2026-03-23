# BodyMotion

Type: interface | Package: com.hypixel.hytale.server.npc.instructions | Extends: Motion

public interface BodyMotion extends Motion

## Methods

- @Nullable BodyMotion getSteeringMotion()

Known implementors: BodyMotionBase, BodyMotionSequence, BodyMotionTimer

Also in this package: Action, ActionList, HeadMotion, Instruction, InstructionHolder, InstructionRandomized, Motion, NullSensor, RoleStateChange, Sensor

Complete API:
  default BodyMotion getSteeringMotion()
  default double getDesiredTargetDistance()
  default Ref<EntityStore> getDesiredTargetEntity()

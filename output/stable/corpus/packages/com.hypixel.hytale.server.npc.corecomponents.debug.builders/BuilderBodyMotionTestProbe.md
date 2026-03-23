# BuilderBodyMotionTestProbe

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.debug.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionTestProbe extends BuilderBodyMotionBase

NPC behavior tree component builder.

## Fields

- adjustX | double | double field.
- adjustZ | double | double field.
- adjustDistance | double | double field.
- snapAngle | float | float field.
- isAvoidingBlockDamage | boolean | boolean field.
- isRelaxedMoveConstraints | boolean | boolean field.

## Methods

- build(BuilderSupport builderSupport) | BodyMotionTestProbe | public method.
- getShortDescription() | String | public method.
- getLongDescription() | String | public method.
- getBuilderDescriptorState() | BuilderDescriptorState | public method.
- readConfig(@Nonnull JsonElement data) | BuilderBodyMotionTestProbe | public method.
- getAdjustX() | double | public method.
- getAdjustZ() | double | public method.
- getAdjustDistance() | double | public method.
- getSnapAngle() | float | public method.
- isAvoidingBlockDamage() | boolean | public method.
- isRelaxedMoveConstraints() | boolean | public method.

Also in this package: BuilderActionLog, BuilderActionTest

Complete API:
  public BodyMotionTestProbe build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionTestProbe readConfig(JsonElement data)
  public double getAdjustX()
  public double getAdjustZ()
  public double getAdjustDistance()
  public float getSnapAngle()
  public boolean isAvoidingBlockDamage()
  public boolean isRelaxedMoveConstraints()

Fields:
protected double adjustX
protected double adjustZ
protected double adjustDistance
protected float snapAngle
protected boolean isAvoidingBlockDamage
protected boolean isRelaxedMoveConstraints

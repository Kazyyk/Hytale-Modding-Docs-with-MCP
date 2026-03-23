# BuilderActionSpawnParticles

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders | Extends: BuilderActionBase

public class BuilderActionSpawnParticles extends BuilderActionBase

## Fields

- protected final AssetHolder particleSystem
- protected final DoubleHolder range
- protected final NumberArrayHolder offset
- protected final StringHolder targetNodeName
- protected final BooleanHolder isDetachedFromModel

## Methods

- @Nonnull public ActionSpawnParticles build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionSpawnParticles readConfig(@Nonnull JsonElement data)
- public String getParticleSystem(@Nonnull BuilderSupport support)
- public double getRange(BuilderSupport support)
- public Vector3d getOffset(BuilderSupport support)
- public String getTargetNodeName(BuilderSupport support)
- public boolean isDetachedFromModel(BuilderSupport support)

Also in this package: BuilderActionAppearance, BuilderActionDisplayName, BuilderActionModelAttachment, BuilderActionPlayAnimation, BuilderActionPlaySound, BuilderSensorAnimation

Complete API:
  public ActionSpawnParticles build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionSpawnParticles readConfig(JsonElement data)
  public String getParticleSystem(BuilderSupport support)
  public double getRange(BuilderSupport support)
  public Vector3d getOffset(BuilderSupport support)
  public String getTargetNodeName(BuilderSupport support)
  public boolean isDetachedFromModel(BuilderSupport support)

Fields:
protected final AssetHolder particleSystem
protected final DoubleHolder range
protected final NumberArrayHolder offset
protected final StringHolder targetNodeName
protected final BooleanHolder isDetachedFromModel

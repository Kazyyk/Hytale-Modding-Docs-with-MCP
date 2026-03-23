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

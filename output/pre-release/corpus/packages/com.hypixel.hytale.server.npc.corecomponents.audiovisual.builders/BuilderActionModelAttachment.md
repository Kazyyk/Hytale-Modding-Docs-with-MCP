# BuilderActionModelAttachment

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders | Extends: BuilderActionBase

public class BuilderActionModelAttachment extends BuilderActionBase

## Fields

- protected final StringHolder slot
- protected final StringHolder attachment

## Methods

- @Nonnull public ActionModelAttachment build(@Nonnull BuilderSupport builderSupport)
- @Nonnull public BuilderActionModelAttachment readConfig(@Nonnull JsonElement data)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- public String getSlot(@Nonnull BuilderSupport support)
- public String getAttachment(@Nonnull BuilderSupport support)

Also in this package: BuilderActionAppearance, BuilderActionDisplayName, BuilderActionPlayAnimation, BuilderActionPlaySound, BuilderActionSpawnParticles, BuilderSensorAnimation

Complete API:
  public ActionModelAttachment build(BuilderSupport builderSupport)
  public BuilderActionModelAttachment readConfig(JsonElement data)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public String getSlot(BuilderSupport support)
  public String getAttachment(BuilderSupport support)

Fields:
protected final StringHolder slot
protected final StringHolder attachment

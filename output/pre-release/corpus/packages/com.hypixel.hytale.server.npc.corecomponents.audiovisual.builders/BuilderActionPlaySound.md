# BuilderActionPlaySound

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders | Extends: BuilderActionBase

public class BuilderActionPlaySound extends BuilderActionBase

## Fields

- protected final AssetHolder soundEventId

## Methods

- @Nonnull public ActionPlaySound build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionPlaySound readConfig(@Nonnull JsonElement data)
- public String getSoundEventId(@Nonnull BuilderSupport support)
- public int getSoundEventIndex(@Nonnull BuilderSupport support)

Also in this package: BuilderActionAppearance, BuilderActionDisplayName, BuilderActionModelAttachment, BuilderActionPlayAnimation, BuilderActionSpawnParticles, BuilderSensorAnimation

Complete API:
  public ActionPlaySound build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionPlaySound readConfig(JsonElement data)
  public String getSoundEventId(BuilderSupport support)
  public int getSoundEventIndex(BuilderSupport support)

Fields:
protected final AssetHolder soundEventId

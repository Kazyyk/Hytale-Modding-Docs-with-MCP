# BuilderActionPlayAnimation

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders | Extends: BuilderActionBase

public class BuilderActionPlayAnimation extends BuilderActionBase

## Fields

- protected NPCAnimationSlot slot
- protected final StringHolder animationId

## Methods

- public ActionPlayAnimation build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionPlayAnimation readConfig(@Nonnull JsonElement data)
- @Override protected void runLoadTimeValidationHelper0(String configName, @Nonnull NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)
- public NPCAnimationSlot getSlot()
- @Nullable public String getAnimationId(@Nonnull BuilderSupport support)

Known subclasses: BuilderActionCompleteTask

Also in this package: BuilderActionAppearance, BuilderActionDisplayName, BuilderActionModelAttachment, BuilderActionPlaySound, BuilderActionSpawnParticles, BuilderSensorAnimation

Complete API:
  public ActionPlayAnimation build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionPlayAnimation readConfig(JsonElement data)
  protected void runLoadTimeValidationHelper0(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)
  public NPCAnimationSlot getSlot()
  public String getAnimationId(BuilderSupport support)

Fields:
protected NPCAnimationSlot slot
protected final StringHolder animationId

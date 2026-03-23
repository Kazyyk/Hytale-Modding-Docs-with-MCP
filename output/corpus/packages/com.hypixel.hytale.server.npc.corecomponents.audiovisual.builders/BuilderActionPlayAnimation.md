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

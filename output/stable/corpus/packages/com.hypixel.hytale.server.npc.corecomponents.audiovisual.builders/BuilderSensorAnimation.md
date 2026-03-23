# BuilderSensorAnimation

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.audiovisual.builders | Extends: BuilderSensorBase

public class BuilderSensorAnimation extends BuilderSensorBase

## Fields

- protected final EnumHolder<NPCAnimationSlot> animationSlot
- protected final StringHolder animationId

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Sensor build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- public NPCAnimationSlot getAnimationSlot(@Nonnull BuilderSupport support)
- public String getAnimationId(@Nonnull BuilderSupport support)

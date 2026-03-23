# BuilderSensorDroppedItem

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.items.builders | Extends: BuilderSensorBase

public class BuilderSensorDroppedItem extends BuilderSensorBase

NPC behavior sensor builder for SensorDroppedItem functionality.

## Fields

- protected final DoubleHolder range
- protected final FloatHolder viewSector
- protected final BooleanHolder hasLineOfSight
- protected final AssetArrayHolder items
- protected final EnumSetHolder<ItemAttitudeGroup.Sentiment> attitudes

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public Sensor build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public Builder<Sensor> readConfig(@Nonnull JsonElement data)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- public double getRange(@Nonnull BuilderSupport support)
- public float getViewSectorRadians(@Nonnull BuilderSupport builderSupport)
- public boolean getHasLineOfSight(@Nonnull BuilderSupport support)
- @Nullable public String[] getItems(@Nonnull BuilderSupport support)
- @Nonnull public EnumSet<Attitude> getAttitudes(@Nonnull BuilderSupport support)

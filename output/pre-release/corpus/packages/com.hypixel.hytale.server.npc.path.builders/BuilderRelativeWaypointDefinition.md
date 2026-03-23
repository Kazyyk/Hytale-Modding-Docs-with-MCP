# BuilderRelativeWaypointDefinition

Type: class | Package: com.hypixel.hytale.server.npc.path.builders | Extends: BuilderBase

public class BuilderRelativeWaypointDefinition extends BuilderBase

## Fields

- protected float rotation
- protected double distance

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public RelativeWaypointDefinition build(BuilderSupport builderSupport)
- @Nonnull @Override public Class<RelativeWaypointDefinition> category()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull @Override public Builder<RelativeWaypointDefinition> readConfig(JsonElement data)
- @Override public final boolean isEnabled(ExecutionContext context)
- public float getRotation()
- public double getDistance()

Also in this package: BuilderTransientPathDefinition

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public RelativeWaypointDefinition build(BuilderSupport builderSupport)
  public Class<RelativeWaypointDefinition> category()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<RelativeWaypointDefinition> readConfig(JsonElement data)
  public final boolean isEnabled(ExecutionContext context)
  public float getRotation()
  public double getDistance()

Fields:
protected float rotation
protected double distance

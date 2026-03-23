# BuilderTransientPathDefinition

Type: class | Package: com.hypixel.hytale.server.npc.path.builders | Extends: BuilderBase

public class BuilderTransientPathDefinition extends BuilderBase

## Fields

- protected final BuilderObjectListHelper<RelativeWaypointDefinition> waypoints
- protected final DoubleHolder scale

## Methods

- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull public TransientPathDefinition build(BuilderSupport builderSupport)
- @Nonnull @Override public Class<TransientPathDefinition> category()
- @Override public final boolean isEnabled(ExecutionContext context)
- @Nonnull @Override public Builder<TransientPathDefinition> readConfig(JsonElement data)
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Override public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
- @Nullable public List<RelativeWaypointDefinition> getWaypoints(BuilderSupport support)
- public double getScale(BuilderSupport support)

Also in this package: BuilderRelativeWaypointDefinition

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public TransientPathDefinition build(BuilderSupport builderSupport)
  public Class<TransientPathDefinition> category()
  public final boolean isEnabled(ExecutionContext context)
  public Builder<TransientPathDefinition> readConfig(JsonElement data)
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public List<RelativeWaypointDefinition> getWaypoints(BuilderSupport support)
  public double getScale(BuilderSupport support)

Fields:
protected final BuilderObjectListHelper<RelativeWaypointDefinition> waypoints
protected final DoubleHolder scale

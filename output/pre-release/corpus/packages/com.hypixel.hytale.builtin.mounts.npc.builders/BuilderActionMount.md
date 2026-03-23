# BuilderActionMount

Type: class | Package: com.hypixel.hytale.builtin.mounts.npc.builders | Extends: BuilderActionBase

public class BuilderActionMount extends BuilderActionBase

Utility type in the `builders` subsystem.

## Accessors

- getShortDescription() | String | Accessor method.
- getLongDescription() | String | Accessor method.
- getBuilderDescriptorState() | BuilderDescriptorState | Accessor method.
- getAnchorX(BuilderSupport support) | float | Accessor method.
- getAnchorY(BuilderSupport support) | float | Accessor method.
- getAnchorZ(BuilderSupport support) | float | Accessor method.
- getMovementConfig(BuilderSupport support) | String | Accessor method.

## Methods

- build(BuilderSupport builderSupport) | ActionMount | Instance method.
- readConfig(JsonElement data) | Builder<Action> | Instance method.

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public float getAnchorX(BuilderSupport support)
  public float getAnchorY(BuilderSupport support)
  public float getAnchorZ(BuilderSupport support)
  public String getMovementConfig(BuilderSupport support)
  public ActionMount build(BuilderSupport builderSupport)
  public Builder<Action> readConfig(JsonElement data)

Fields:
protected final FloatHolder anchorX
protected final FloatHolder anchorY
protected final FloatHolder anchorZ
protected final StringHolder movementConfig

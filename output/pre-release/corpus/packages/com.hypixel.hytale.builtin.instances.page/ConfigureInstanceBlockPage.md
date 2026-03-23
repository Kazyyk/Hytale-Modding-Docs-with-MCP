# ConfigureInstanceBlockPage

Type: class | Package: com.hypixel.hytale.builtin.instances.page | Extends: InteractiveCustomUIPage<ConfigureInstanceBlockPage.PageData>

public class ConfigureInstanceBlockPage extends InteractiveCustomUIPage<ConfigureInstanceBlockPage.PageData>

Custom UI page for configuring an instance block (a block that teleports players to game instances). Allows the player to select an instance from a dropdown, configure position offset (X/Y/Z), rotation (pitch/yaw/roll), instance key, personal return point flag, close-on-remove flag, and remove-block-after timer.

Uses the `Pages/ConfigureInstanceBlockPage.ui` template. Changes are written to the `ConfigurableInstanceBlock` component on save and the chunk is marked as needing save.

## Inner Types

### Action


public static enum Action

- Save | Persist all configuration to the block component.
- PositionOffset | Toggle the position offset fields.
- Rotation | Toggle the rotation fields.

### PageData


public static class PageData

Codec-serialized event data containing all form fields. Decoded via `BuilderCodec` from UI event bindings.

Also in this package: Action, Action, InstanceListPage, PageData, PageData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ConfigureInstanceBlockPage.PageData data)
  private String emptyToNull(String s)
  private void buildPositionOffset(UICommandBuilder commandBuilder)
  private void buildRotation(UICommandBuilder commandBuilder)

Fields:
private final ConfigurableInstanceBlock instanceBlock
private final Ref<ChunkStore> ref
private Vector3d positionOffset
private Vector3f rotation

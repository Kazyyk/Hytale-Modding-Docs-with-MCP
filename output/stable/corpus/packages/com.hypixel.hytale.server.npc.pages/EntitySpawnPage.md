# EntitySpawnPage

Type: class | Package: com.hypixel.hytale.server.npc.pages | Extends: InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>

public class EntitySpawnPage extends InteractiveCustomUIPage<EntitySpawnPage.EntitySpawnPageEventData>

Interactive custom UI page for spawning NPCs, items, and models with preview, rotation offset, scale control, and tab-based navigation.

## Constants

- BuilderCodec<EntitySpawnPage.EntitySpawnPageEventData> CODEC

## Key Methods

- public void build(@Nonnull Ref<EntityStore> ref, @Nonnull UICommandBuilder commandBuilder, @Nonnull UIEventBuilder eventBuilder, @Nonnull Store<EntityStore> store)
- public void handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull EntitySpawnPage.EntitySpawnPageEventData data)
- public void onDismiss(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store)

Also in this package: EntitySpawnPageEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, EntitySpawnPage.EntitySpawnPageEventData data)
  private void handleSelect(Ref<EntityStore> ref, Store<EntityStore> store, EntitySpawnPage.EntitySpawnPageEventData data)
  private void handleSetItemMaterial(Ref<EntityStore> ref, Store<EntityStore> store, EntitySpawnPage.EntitySpawnPageEventData data)
  private void clearSelectedItem(Ref<EntityStore> ref, Store<EntityStore> store)
  private void handleSpawn(Ref<EntityStore> ref, Store<EntityStore> store, EntitySpawnPage.EntitySpawnPageEventData data)
  private void spawnNPC(Ref<EntityStore> ref, Store<EntityStore> store, int count)
  private void spawnModel(Ref<EntityStore> ref, Store<EntityStore> store, int count)
  public void onDismiss(Ref<EntityStore> ref, Store<EntityStore> store)
  private void clearPreview(Store<EntityStore> store)
  private void updateTabVisibility(UICommandBuilder commandBuilder)
  private void buildList(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildNPCList(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildModelList(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void buildItemsContent(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder)
  private void selectItem(Ref<EntityStore> ref, Store<EntityStore> store, String itemId, UICommandBuilder commandBuilder)
  private void spawnItem(Ref<EntityStore> ref, Store<EntityStore> store, int count)
  private String getItemModelId(Item item)
  private Model getItemModel(Item item)
  private void selectNPCRole(Ref<EntityStore> ref, Store<EntityStore> store, String npcRole, UICommandBuilder commandBuilder)
  private void selectModel(Ref<EntityStore> ref, Store<EntityStore> store, String modelId, UICommandBuilder commandBuilder)
  private void initPosition(Ref<EntityStore> ref, Store<EntityStore> store)
  private void createOrUpdatePreview(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder, Model model)
  private void updatePreviewScale(Ref<EntityStore> ref, Store<EntityStore> store)
  private void createOrUpdateBlockPreview(Ref<EntityStore> ref, Store<EntityStore> store, String blockTypeKey)
  private void createOrUpdateItemPreview(Ref<EntityStore> ref, Store<EntityStore> store, String itemId)
  private Model getNPCModel()

Fields:
private static final String COMMON_TEXT_BUTTON_DOCUMENT
private static final String COMMON_UI_DOCUMENT
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private static final Value<String> TAB_STYLE_ACTIVE
private static final Value<String> TAB_STYLE_INACTIVE
private static final String TAB_NPC
private static final String TAB_ITEMS
private static final String TAB_MODEL
private static final String KEY_SELECT_AN_ITEM
private static final String KEY_SELECT_AN_NPC
private static final String KEY_SELECT_A_MODEL
private static final int MAX_SPAWN_COUNT
private static final float BLOCK_ENTITY_BASE_SCALE
private static final int LOOK_RAYCAST_DISTANCE
private static final int FALLBACK_RAYCAST_DOWN_DISTANCE
private static final double FALLBACK_RAYCAST_Y_OFFSET
private String activeTab
private String searchQuery
private List<String> npcRoles
private String selectedNpcRole
private List<String> modelIds
private String selectedModelId
private String selectedItemId
private Ref<EntityStore> modelPreview
private Vector3d position
private Vector3f rotation
private float currentRotationOffset
private float currentScale
private float lastPreviewScale
private long lastScaleUpdateTime

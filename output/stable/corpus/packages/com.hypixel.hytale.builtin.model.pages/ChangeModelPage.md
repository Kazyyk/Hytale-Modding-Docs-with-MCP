# ChangeModelPage

Type: class | Package: com.hypixel.hytale.builtin.model.pages

public class ChangeModelPage

UI page allowing players to change the model of an entity through the built-in model editor interface.

Also in this package: PageEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ChangeModelPage.PageEventData data)
  public void onDismiss(Ref<EntityStore> ref, Store<EntityStore> store)
  private void buildModelList(Ref<EntityStore> ref, Store<EntityStore> store, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder)
  private void selectModel(Ref<EntityStore> ref, Store<EntityStore> store, String modelId, UICommandBuilder commandBuilder)
  private Model getModel(float scale)

Fields:
private static final String COMMON_TEXT_BUTTON_DOCUMENT
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private String searchQuery
private List<String> models
private String selectedModel
private Ref<EntityStore> modelPreview
private Vector3d position
private Vector3f rotation
private float scale

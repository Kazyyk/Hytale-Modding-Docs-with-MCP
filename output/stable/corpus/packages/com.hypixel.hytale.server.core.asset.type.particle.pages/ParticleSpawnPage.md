# ParticleSpawnPage

Type: class | Package: com.hypixel.hytale.server.core.asset.type.particle.pages

public class ParticleSpawnPage

UI page configuration for particle spawn settings in the asset editor.

Also in this package: ParticleSpawnPageEventData

Complete API:
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ParticleSpawnPage.ParticleSpawnPageEventData data)
  public void onDismiss(Ref<EntityStore> ref, Store<EntityStore> store)
  private void buildParticleList(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  private void selectParticleSystem(Ref<EntityStore> ref, Store<EntityStore> store, String particleSystemId, UICommandBuilder commandBuilder)

Fields:
private static final String COMMON_TEXT_BUTTON_DOCUMENT
private static final Value<String> BUTTON_LABEL_STYLE
private static final Value<String> BUTTON_LABEL_STYLE_SELECTED
private String searchQuery
private List<String> particleSystemIds
private String selectedParticleSystemId
private Ref<EntityStore> particleSystemPreview
private Vector3d position
private Vector3f rotation

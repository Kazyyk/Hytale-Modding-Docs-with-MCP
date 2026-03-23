# ObjectiveLocationMarker

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation

public class ObjectiveLocationMarker

ECS component (`Component<EntityStore>`) representing an objective location marker in the world. Stores the marker asset ID, active objective UUID, area bounds, environment index filter, and trigger conditions. Codec-serializable via `CODEC`. Updates area and trigger configuration from the associated `ObjectiveLocationMarkerAsset`.

Also in this package: EnsureNetworkSendableSystem, InitSystem, ObjectiveLocationMarkerSystems, TickingSystem

Complete API:
  public static ComponentType<EntityStore,ObjectiveLocationMarker> getComponentType()
  public void setObjectiveLocationMarkerId(String objectiveLocationMarkerId)
  public void setActiveObjectiveUUID(UUID activeObjectiveUUID)
  public Objective getActiveObjective()
  public void setActiveObjective(Objective activeObjective)
  public String getObjectiveLocationMarkerId()
  public UntrackObjective getUntrackPacket()
  public void setUntrackPacket(UntrackObjective untrackPacket)
  public ObjectiveLocationMarkerArea getArea()
  public void updateLocationMarkerValues(ObjectiveLocationMarkerAsset objectiveLocationMarkerAsset, float yaw, Store<EntityStore> store)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<ObjectiveLocationMarker> CODEC
protected String objectiveLocationMarkerId
protected UUID activeObjectiveUUID
protected ObjectiveLocationMarkerArea area
protected int[] environmentIndexes
protected ObjectiveLocationTriggerCondition[] triggerConditions
private Objective activeObjective
private UntrackObjective untrackPacket

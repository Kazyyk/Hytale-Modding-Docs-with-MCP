# ObjectiveLocationMarker

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation

public class ObjectiveLocationMarker

ECS component (`Component<EntityStore>`) representing an objective location marker in the world. Stores the marker asset ID, active objective UUID, area bounds, environment index filter, and trigger conditions. Codec-serializable via `CODEC`. Updates area and trigger configuration from the associated `ObjectiveLocationMarkerAsset`.

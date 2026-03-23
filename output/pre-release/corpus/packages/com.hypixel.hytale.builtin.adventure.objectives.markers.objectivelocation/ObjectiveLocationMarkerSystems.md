# ObjectiveLocationMarkerSystems

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.objectivelocation

public class ObjectiveLocationMarkerSystems

Container for ECS systems that drive objective location markers. Contains `EnsureNetworkSendableSystem` (assigns network IDs), `InitSystem` (loads marker assets, restores active objectives, sets up model bounding box), and `TickingSystem` (spatial player detection, objective tracking/untracking, trigger condition evaluation).

Also in this package: EnsureNetworkSendableSystem, InitSystem, ObjectiveLocationMarker, TickingSystem

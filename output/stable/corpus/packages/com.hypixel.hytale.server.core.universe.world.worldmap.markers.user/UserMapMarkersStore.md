# UserMapMarkersStore

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers.user

public interface UserMapMarkersStore

Known implementors: PlayerWorldData, WorldMarkersResource

Also in this package: CanRemove, CanSpawn, Fail, PlaceResult, RemoveResult, UserMapMarker, UserMarkerValidator

Complete API:
  Collection<? extends UserMapMarker> getUserMapMarkers()
  Collection<? extends UserMapMarker> getUserMapMarkers(UUID var1)
  void setUserMapMarkers(Collection<? extends UserMapMarker> var1)
  default void addUserMapMarker(UserMapMarker marker)
  default void removeUserMapMarker(String markerId)
  UserMapMarker getUserMapMarker(String var1)

# WorldMarkersResource

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers.worldstore | Implements: Resource, UserMapMarkersStore

public class WorldMarkersResource implements Resource, UserMapMarkersStore

## Fields

- public static final BuilderCodec<WorldMarkersResource> CODEC
- private Map<String,UserMapMarker> mapMarkersById

## Methods

- public static ResourceType<ChunkStore,WorldMarkersResource> getResourceType()
- @NonNullDecl @Override public Collection<? extends UserMapMarker> getUserMapMarkers()
- @NonNullDecl @Override public Collection<? extends UserMapMarker> getUserMapMarkers(UUID createdByUuid)
- @Override public void setUserMapMarkers(Collection<? extends UserMapMarker> markers)
- @NullableDecl @Override public UserMapMarker getUserMapMarker(String markerId)
- @NullableDecl @Override public Resource<ChunkStore> clone()

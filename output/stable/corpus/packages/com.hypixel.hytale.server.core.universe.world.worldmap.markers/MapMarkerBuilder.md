# MapMarkerBuilder

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers

public class MapMarkerBuilder

Class in the markers subsystem.

## Fields

- id | String | final String field.
- image | String | final String field.
- transform | Transform | final Transform field.
- name | Message | Message field.
- customName | String | String field.
- contextMenuItems | List<ContextMenuItem> | List<ContextMenuItem> field.
- mapMarkerComponents | List<MapMarkerComponent> | List<MapMarkerComponent> field.

## Constructors

- MapMarkerBuilder(String id, String image, Transform transform) | Creates a new MapMarkerBuilder instance.

## Methods

- withName(Message name) | MapMarkerBuilder | public method.
- withCustomName(String customName) | MapMarkerBuilder | public method.
- withContextMenuItem(ContextMenuItem contextMenuItem) | MapMarkerBuilder | public method.
- withComponent(MapMarkerComponent component) | MapMarkerBuilder | public method.
- build() | MapMarker | public method.

Also in this package: MapMarkerTracker, MarkersCollector, MarkersCollectorImpl

Complete API:
  public MapMarkerBuilder withName(Message name)
  public MapMarkerBuilder withCustomName(String customName)
  public MapMarkerBuilder withContextMenuItem(ContextMenuItem contextMenuItem)
  public MapMarkerBuilder withComponent(MapMarkerComponent component)
  public MapMarker build()

Fields:
private final String id
private final String image
private final Transform transform
private Message name
private String customName
private List<ContextMenuItem> contextMenuItems
private List<MapMarkerComponent> mapMarkerComponents

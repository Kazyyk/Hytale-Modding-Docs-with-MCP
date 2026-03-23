# SpawnSuppressorEntry

Type: class | Package: com.hypixel.hytale.server.spawning.suppression

public class SpawnSuppressorEntry

Class in the suppression subsystem.

## Fields

- suppressionId | String | String field.
- position | Vector3d | Vector3d field.

## Constructors

- SpawnSuppressorEntry(String suppressionId, Vector3d position) | Creates a new SpawnSuppressorEntry instance.
- SpawnSuppressorEntry() | Creates a new SpawnSuppressorEntry instance.

## Methods

- getPosition() | Vector3d | public method.
- getSuppressionId() | String | public method.

Also in this package: Span, SuppressionSpanHelper

Complete API:
  public Vector3d getPosition()
  public String getSuppressionId()

Fields:
public static final BuilderCodec<SpawnSuppressorEntry> CODEC
private String suppressionId
private Vector3d position

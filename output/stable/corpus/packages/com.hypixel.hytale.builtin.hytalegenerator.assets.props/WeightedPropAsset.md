# WeightedPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props | Extends: PropAsset

public class WeightedPropAsset extends PropAsset

Selects a prop randomly from a weighted list, with an optional skip chance and seed for deterministic randomness.

Also in this package: Argument, BoxPropAsset, ClusterPropAsset, ColumnBlock, ColumnPropAsset, DensityPropAsset, EntryAsset, ImportedPropAsset, NoPropAsset, OffsetPropAsset, PondFillerPropAsset, PropAsset, QueuePropAsset, UnionPropAsset, WeightedPropAsset

Complete API:
  public Prop build(PropAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedPropAsset> CODEC
private WeightedPropAsset.EntryAsset[] entryAssets
private String seed

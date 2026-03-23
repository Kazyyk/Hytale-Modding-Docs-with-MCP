# PaletteSetProvider

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette

public class PaletteSetProvider

Thread-local provider of reusable `ByteSet` and `ShortSet` instances for palette lookup operations, avoiding allocation per query.

Also in this package: AbstractByteSectionPalette, AbstractShortSectionPalette, ByteSectionPalette, EmptySectionPalette, HalfByteSectionPalette, ISectionPalette, KeySerializer, PaletteTypeEnum, SetResult, ShortSectionPalette

Complete API:
  public ByteSet getByteSet(int size)
  public ShortSet getShortSet(int size)
  protected static PaletteSetProvider get()

Fields:
private static final ThreadLocal<PaletteSetProvider> LOCAL
private final ByteOpenHashSet byteHashSet
private final ShortOpenHashSet shortHashSet

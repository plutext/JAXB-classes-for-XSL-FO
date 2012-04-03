
package org.plutext.jaxb.xslfo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *           Inheritable 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;attribute xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" xmlns:xjc="http://java.sun.com/xml/ns/jaxb/xjc" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="visibility" type="fo:visibility_Type"/&gt;
 * </pre>
 *  
 *         
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/1999/XSL/Format}table-cell" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}keep_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}Aural_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}Accessibility_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}Border_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}Background_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}break_Properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}inheritable_properties_List"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/XSL/Format}Relative_Position_Properties_List"/>
 *       &lt;attribute name="block-progression-dimension" type="{http://www.w3.org/1999/XSL/Format}margin_width_Type" />
 *       &lt;attribute name="block-progression-dimension.minimum" type="{http://www.w3.org/1999/XSL/Format}length_Type" />
 *       &lt;attribute name="block-progression-dimension.optimum" type="{http://www.w3.org/1999/XSL/Format}block_progression_dimension_optimum_Type" />
 *       &lt;attribute name="block-progression-dimension.maximum" type="{http://www.w3.org/1999/XSL/Format}block_progression_dimension_maximum_Type" />
 *       &lt;attribute name="border-after-precedence" type="{http://www.w3.org/1999/XSL/Format}precedence_Type" />
 *       &lt;attribute name="border-before-precedence" type="{http://www.w3.org/1999/XSL/Format}precedence_Type" />
 *       &lt;attribute name="border-end-precedence" type="{http://www.w3.org/1999/XSL/Format}precedence_Type" />
 *       &lt;attribute name="border-start-precedence" type="{http://www.w3.org/1999/XSL/Format}precedence_Type" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="height" type="{http://www.w3.org/1999/XSL/Format}height_Type" />
 *       &lt;attribute name="page-break-after" type="{http://www.w3.org/1999/XSL/Format}page_break_after_Type" />
 *       &lt;attribute name="page-break-before" type="{http://www.w3.org/1999/XSL/Format}page_break_after_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableCell"
})
@XmlRootElement(name = "table-row")
public class TableRow {

    @XmlElement(name = "table-cell", required = true)
    protected List<TableCell> tableCell;
    @XmlAttribute(name = "block-progression-dimension")
    protected String blockProgressionDimension;
    @XmlAttribute(name = "block-progression-dimension.minimum")
    protected String blockProgressionDimensionMinimum;
    @XmlAttribute(name = "block-progression-dimension.optimum")
    protected String blockProgressionDimensionOptimum;
    @XmlAttribute(name = "block-progression-dimension.maximum")
    protected String blockProgressionDimensionMaximum;
    @XmlAttribute(name = "border-after-precedence")
    protected PrecedenceType borderAfterPrecedence;
    @XmlAttribute(name = "border-before-precedence")
    protected PrecedenceType borderBeforePrecedence;
    @XmlAttribute(name = "border-end-precedence")
    protected PrecedenceType borderEndPrecedence;
    @XmlAttribute(name = "border-start-precedence")
    protected PrecedenceType borderStartPrecedence;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String height;
    @XmlAttribute(name = "page-break-after")
    protected PageBreakAfterType pageBreakAfter;
    @XmlAttribute(name = "page-break-before")
    protected PageBreakAfterType pageBreakBefore;
    @XmlAttribute(name = "keep-with-next")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepWithNext;
    @XmlAttribute(name = "keep-with-previous")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepWithPrevious;
    @XmlAttribute
    protected String azimuth;
    @XmlAttribute
    protected String cue;
    @XmlAttribute(name = "cue-after")
    protected String cueAfter;
    @XmlAttribute(name = "cue-before")
    protected String cueBefore;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String elevation;
    @XmlAttribute
    protected String pause;
    @XmlAttribute(name = "pause-after")
    protected String pauseAfter;
    @XmlAttribute(name = "pause-before")
    protected String pauseBefore;
    @XmlAttribute
    protected String pitch;
    @XmlAttribute(name = "pitch-range")
    protected String pitchRange;
    @XmlAttribute(name = "play-during")
    protected String playDuring;
    @XmlAttribute
    protected String richness;
    @XmlAttribute
    protected String speak;
    @XmlAttribute(name = "speak-header")
    protected String speakHeader;
    @XmlAttribute(name = "speak-numeral")
    protected SpeakNumeralType speakNumeral;
    @XmlAttribute(name = "speak-punctuation")
    protected String speakPunctuation;
    @XmlAttribute(name = "speech-rate")
    protected String speechRate;
    @XmlAttribute
    protected String stress;
    @XmlAttribute(name = "voice-family")
    protected String voiceFamily;
    @XmlAttribute
    protected String volume;
    @XmlAttribute(name = "source-document")
    protected String sourceDocument;
    @XmlAttribute
    protected String role;
    @XmlAttribute
    protected String border;
    @XmlAttribute(name = "border-before-color")
    protected String borderBeforeColor;
    @XmlAttribute(name = "border-before-style")
    protected BorderStyleType borderBeforeStyle;
    @XmlAttribute(name = "border-before-width")
    protected String borderBeforeWidth;
    @XmlAttribute(name = "border-before-width.length")
    protected String borderBeforeWidthLength;
    @XmlAttribute(name = "border-before-width.conditionality")
    protected ConditionalityType borderBeforeWidthConditionality;
    @XmlAttribute(name = "border-after-color")
    protected String borderAfterColor;
    @XmlAttribute(name = "border-after-style")
    protected BorderStyleType borderAfterStyle;
    @XmlAttribute(name = "border-after-width")
    protected String borderAfterWidth;
    @XmlAttribute(name = "border-after-width.length")
    protected String borderAfterWidthLength;
    @XmlAttribute(name = "border-after-width.conditionality")
    protected ConditionalityType borderAfterWidthConditionality;
    @XmlAttribute(name = "border-start-color")
    protected String borderStartColor;
    @XmlAttribute(name = "border-start-style")
    protected BorderStyleType borderStartStyle;
    @XmlAttribute(name = "border-start-width")
    protected String borderStartWidth;
    @XmlAttribute(name = "border-start-width.length")
    protected String borderStartWidthLength;
    @XmlAttribute(name = "border-start-width.conditionality")
    protected ConditionalityType borderStartWidthConditionality;
    @XmlAttribute(name = "border-end-color")
    protected String borderEndColor;
    @XmlAttribute(name = "border-end-style")
    protected BorderStyleType borderEndStyle;
    @XmlAttribute(name = "border-end-width")
    protected String borderEndWidth;
    @XmlAttribute(name = "border-end-width.length")
    protected String borderEndWidthLength;
    @XmlAttribute(name = "border-end-width.conditionality")
    protected ConditionalityType borderEndWidthConditionality;
    @XmlAttribute(name = "border-top-color")
    protected String borderTopColor;
    @XmlAttribute(name = "border-top-style")
    protected BorderStyleType borderTopStyle;
    @XmlAttribute(name = "border-top-width")
    protected String borderTopWidth;
    @XmlAttribute(name = "border-top-width.length")
    protected String borderTopWidthLength;
    @XmlAttribute(name = "border-top-width.conditionality")
    protected ConditionalityType borderTopWidthConditionality;
    @XmlAttribute(name = "border-bottom-color")
    protected String borderBottomColor;
    @XmlAttribute(name = "border-bottom-style")
    protected BorderStyleType borderBottomStyle;
    @XmlAttribute(name = "border-bottom-width")
    protected String borderBottomWidth;
    @XmlAttribute(name = "border-bottom-width.length")
    protected String borderBottomWidthLength;
    @XmlAttribute(name = "border-bottom-width.conditionality")
    protected ConditionalityType borderBottomWidthConditionality;
    @XmlAttribute(name = "border-left-color")
    protected String borderLeftColor;
    @XmlAttribute(name = "border-left-style")
    protected BorderStyleType borderLeftStyle;
    @XmlAttribute(name = "border-left-width")
    protected String borderLeftWidth;
    @XmlAttribute(name = "border-left-width.length")
    protected String borderLeftWidthLength;
    @XmlAttribute(name = "border-left-width.conditionality")
    protected ConditionalityType borderLeftWidthConditionality;
    @XmlAttribute(name = "border-right-color")
    protected String borderRightColor;
    @XmlAttribute(name = "border-right-style")
    protected BorderStyleType borderRightStyle;
    @XmlAttribute(name = "border-right-width")
    protected String borderRightWidth;
    @XmlAttribute(name = "border-right-width.length")
    protected String borderRightWidthLength;
    @XmlAttribute(name = "border-right-width.conditionality")
    protected ConditionalityType borderRightWidthConditionality;
    @XmlAttribute(name = "background-color")
    protected String backgroundColor;
    @XmlAttribute(name = "background-attachment")
    protected BackgroundAttachmentType backgroundAttachment;
    @XmlAttribute(name = "background-image")
    protected String backgroundImage;
    @XmlAttribute(name = "background-repeat")
    protected BackgroundRepeatType backgroundRepeat;
    @XmlAttribute(name = "background-position-horizontal")
    protected String backgroundPositionHorizontal;
    @XmlAttribute(name = "background-position-vertical")
    protected String backgroundPositionVertical;
    @XmlAttribute(name = "break-after")
    protected BreaksType breakAfter;
    @XmlAttribute(name = "break-before")
    protected BreaksType breakBefore;
    @XmlAttribute(name = "auto-restore")
    protected AutoRestoreType autoRestore;
    @XmlAttribute
    protected List<String> background;
    @XmlAttribute(name = "border-spacing")
    protected String borderSpacing;
    @XmlAttribute(name = "caption-side")
    protected CaptionSideType captionSide;
    @XmlAttribute
    protected DirectionType direction;
    @XmlAttribute(name = "empty-cells")
    protected EmptyCellsType emptyCells;
    @XmlAttribute
    protected String font;
    @XmlAttribute(name = "font-selection-strategy")
    protected FontSelectionStrategyType fontSelectionStrategy;
    @XmlAttribute(name = "font-size-adjust")
    protected String fontSizeAdjust;
    @XmlAttribute(name = "font-stretch")
    protected String fontStretch;
    @XmlAttribute(name = "font-variant")
    protected FontVariantType fontVariant;
    @XmlAttribute(name = "glyph-orientation-vertical")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String glyphOrientationVertical;
    @XmlAttribute(name = "glyph-orientation-horizontal")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String glyphOrientationHorizontal;
    @XmlAttribute(name = "hyphenation-keep")
    protected HyphenationKeepType hyphenationKeep;
    @XmlAttribute(name = "hyphenation-ladder-count")
    protected String hyphenationLadderCount;
    @XmlAttribute(name = "intrusion-displace")
    protected DisplaceType intrusionDisplace;
    @XmlAttribute(name = "last-line-end-indent")
    protected String lastLineEndIndent;
    @XmlAttribute(name = "line-height-shift-adjustment")
    protected LineHeightShiftAdjustmentType lineHeightShiftAdjustment;
    @XmlAttribute(name = "line-stacking-strategy")
    protected LineStackingStrategyType lineStackingStrategy;
    @XmlAttribute(name = "linefeed-treatment")
    protected LinefeedTreatmentType linefeedTreatment;
    @XmlAttribute
    protected List<String> margin;
    @XmlAttribute(name = "max-width")
    protected String maxWidth;
    @XmlAttribute(name = "min-height")
    protected String minHeight;
    @XmlAttribute(name = "min-width")
    protected String minWidth;
    @XmlAttribute(name = "page-break-inside")
    protected PageBreakInsideType pageBreakInside;
    @XmlAttribute(name = "reference-orientation")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String referenceOrientation;
    @XmlAttribute(name = "score-spaces")
    protected ScoreSpacesType scoreSpaces;
    @XmlAttribute
    protected String script;
    @XmlAttribute(name = "text-transform")
    protected TextTransformType textTransform;
    @XmlAttribute
    protected VisibilityType visibility;
    @XmlAttribute(name = "white-space")
    protected WhiteSpaceType whiteSpace;
    @XmlAttribute(name = "white-space-treatment")
    protected WhiteSpaceTreatmentType whiteSpaceTreatment;
    @XmlAttribute(name = "word-spacing")
    protected String wordSpacing;
    @XmlAttribute(name = "writing-mode")
    protected WritingModeType writingMode;
    @XmlAttribute(name = "border-bottom")
    protected String borderBottom;
    @XmlAttribute(name = "border-collapse")
    protected BorderCollapseType borderCollapse;
    @XmlAttribute(name = "border-color")
    protected List<String> borderColor;
    @XmlAttribute(name = "border-left")
    protected String borderLeft;
    @XmlAttribute(name = "border-right")
    protected String borderRight;
    @XmlAttribute(name = "border-separation")
    protected List<String> borderSeparation;
    @XmlAttribute(name = "border-style")
    protected List<BorderStyleType> borderStyle;
    @XmlAttribute(name = "border-top")
    protected String borderTop;
    @XmlAttribute(name = "border-width")
    protected List<String> borderWidth;
    @XmlAttribute
    protected String color;
    @XmlAttribute
    protected CountryType country;
    @XmlAttribute(name = "display-align")
    protected DisplayAlignType displayAlign;
    @XmlAttribute(name = "end-indent")
    protected String endIndent;
    @XmlAttribute(name = "font-family")
    protected String fontFamily;
    @XmlAttribute(name = "font-size")
    protected String fontSize;
    @XmlAttribute(name = "font-style")
    protected FontStyleType fontStyle;
    @XmlAttribute(name = "font-weight")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fontWeight;
    @XmlAttribute
    protected HyphenateType hyphenate;
    @XmlAttribute(name = "hyphenation-character")
    protected String hyphenationCharacter;
    @XmlAttribute(name = "hyphenation-push-character-count")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hyphenationPushCharacterCount;
    @XmlAttribute(name = "hyphenation-remain-character-count")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String hyphenationRemainCharacterCount;
    @XmlAttribute(name = "keep-together")
    protected List<String> keepTogether;
    @XmlAttribute(name = "keep-together.within-column")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepTogetherWithinColumn;
    @XmlAttribute(name = "keep-together.within-line")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepTogetherWithinLine;
    @XmlAttribute(name = "keep-together.within-page")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String keepTogetherWithinPage;
    @XmlAttribute
    protected LanguageType language;
    @XmlAttribute(name = "leader-alignment")
    protected LeaderAlignmentType leaderAlignment;
    @XmlAttribute(name = "leader-length")
    protected List<String> leaderLength;
    @XmlAttribute(name = "leader-length.maximum")
    protected String leaderLengthMaximum;
    @XmlAttribute(name = "leader-length.minimum")
    protected String leaderLengthMinimum;
    @XmlAttribute(name = "leader-length.optimum")
    protected String leaderLengthOptimum;
    @XmlAttribute(name = "leader-pattern")
    protected LeaderPatternType leaderPattern;
    @XmlAttribute(name = "leader-pattern-width")
    protected String leaderPatternWidth;
    @XmlAttribute(name = "letter-spacing")
    protected String letterSpacing;
    @XmlAttribute(name = "line-height")
    protected String lineHeight;
    @XmlAttribute
    protected String orphans;
    @XmlAttribute
    protected PositionType position;
    @XmlAttribute(name = "provisional-distance-between-starts")
    protected String provisionalDistanceBetweenStarts;
    @XmlAttribute(name = "provisional-label-separation")
    protected String provisionalLabelSeparation;
    @XmlAttribute(name = "relative-align")
    protected RelativeAlignType relativeAlign;
    @XmlAttribute(name = "rule-style")
    protected RuleStyleType ruleStyle;
    @XmlAttribute(name = "rule-thickness")
    protected String ruleThickness;
    @XmlAttribute(name = "start-indent")
    protected String startIndent;
    @XmlAttribute(name = "text-align")
    protected TextAlignType textAlign;
    @XmlAttribute(name = "text-align-last")
    protected TextAlignLastType textAlignLast;
    @XmlAttribute(name = "text-indent")
    protected String textIndent;
    @XmlAttribute(name = "white-space-collapse")
    protected WhiteSpaceCollapseType whiteSpaceCollapse;
    @XmlAttribute
    protected String widows;
    @XmlAttribute(name = "wrap-option")
    protected WrapOptionType wrapOption;
    @XmlAttribute(name = "relative-position")
    protected RelativePositionType relativePosition;
    @XmlAttribute
    protected String top;
    @XmlAttribute
    protected String right;
    @XmlAttribute
    protected String bottom;
    @XmlAttribute
    protected String left;

    /**
     * Gets the value of the tableCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableCell }
     * 
     * 
     */
    public List<TableCell> getTableCell() {
        if (tableCell == null) {
            tableCell = new ArrayList<TableCell>();
        }
        return this.tableCell;
    }

    /**
     * Gets the value of the blockProgressionDimension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockProgressionDimension() {
        return blockProgressionDimension;
    }

    /**
     * Sets the value of the blockProgressionDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockProgressionDimension(String value) {
        this.blockProgressionDimension = value;
    }

    /**
     * Gets the value of the blockProgressionDimensionMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockProgressionDimensionMinimum() {
        return blockProgressionDimensionMinimum;
    }

    /**
     * Sets the value of the blockProgressionDimensionMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockProgressionDimensionMinimum(String value) {
        this.blockProgressionDimensionMinimum = value;
    }

    /**
     * Gets the value of the blockProgressionDimensionOptimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockProgressionDimensionOptimum() {
        return blockProgressionDimensionOptimum;
    }

    /**
     * Sets the value of the blockProgressionDimensionOptimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockProgressionDimensionOptimum(String value) {
        this.blockProgressionDimensionOptimum = value;
    }

    /**
     * Gets the value of the blockProgressionDimensionMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockProgressionDimensionMaximum() {
        return blockProgressionDimensionMaximum;
    }

    /**
     * Sets the value of the blockProgressionDimensionMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockProgressionDimensionMaximum(String value) {
        this.blockProgressionDimensionMaximum = value;
    }

    /**
     * Gets the value of the borderAfterPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedenceType }
     *     
     */
    public PrecedenceType getBorderAfterPrecedence() {
        return borderAfterPrecedence;
    }

    /**
     * Sets the value of the borderAfterPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedenceType }
     *     
     */
    public void setBorderAfterPrecedence(PrecedenceType value) {
        this.borderAfterPrecedence = value;
    }

    /**
     * Gets the value of the borderBeforePrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedenceType }
     *     
     */
    public PrecedenceType getBorderBeforePrecedence() {
        return borderBeforePrecedence;
    }

    /**
     * Sets the value of the borderBeforePrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedenceType }
     *     
     */
    public void setBorderBeforePrecedence(PrecedenceType value) {
        this.borderBeforePrecedence = value;
    }

    /**
     * Gets the value of the borderEndPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedenceType }
     *     
     */
    public PrecedenceType getBorderEndPrecedence() {
        return borderEndPrecedence;
    }

    /**
     * Sets the value of the borderEndPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedenceType }
     *     
     */
    public void setBorderEndPrecedence(PrecedenceType value) {
        this.borderEndPrecedence = value;
    }

    /**
     * Gets the value of the borderStartPrecedence property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedenceType }
     *     
     */
    public PrecedenceType getBorderStartPrecedence() {
        return borderStartPrecedence;
    }

    /**
     * Sets the value of the borderStartPrecedence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedenceType }
     *     
     */
    public void setBorderStartPrecedence(PrecedenceType value) {
        this.borderStartPrecedence = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the pageBreakAfter property.
     * 
     * @return
     *     possible object is
     *     {@link PageBreakAfterType }
     *     
     */
    public PageBreakAfterType getPageBreakAfter() {
        return pageBreakAfter;
    }

    /**
     * Sets the value of the pageBreakAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageBreakAfterType }
     *     
     */
    public void setPageBreakAfter(PageBreakAfterType value) {
        this.pageBreakAfter = value;
    }

    /**
     * Gets the value of the pageBreakBefore property.
     * 
     * @return
     *     possible object is
     *     {@link PageBreakAfterType }
     *     
     */
    public PageBreakAfterType getPageBreakBefore() {
        return pageBreakBefore;
    }

    /**
     * Sets the value of the pageBreakBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageBreakAfterType }
     *     
     */
    public void setPageBreakBefore(PageBreakAfterType value) {
        this.pageBreakBefore = value;
    }

    /**
     * Gets the value of the keepWithNext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepWithNext() {
        return keepWithNext;
    }

    /**
     * Sets the value of the keepWithNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepWithNext(String value) {
        this.keepWithNext = value;
    }

    /**
     * Gets the value of the keepWithPrevious property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepWithPrevious() {
        return keepWithPrevious;
    }

    /**
     * Sets the value of the keepWithPrevious property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepWithPrevious(String value) {
        this.keepWithPrevious = value;
    }

    /**
     * Gets the value of the azimuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzimuth() {
        return azimuth;
    }

    /**
     * Sets the value of the azimuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzimuth(String value) {
        this.azimuth = value;
    }

    /**
     * Gets the value of the cue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCue() {
        return cue;
    }

    /**
     * Sets the value of the cue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCue(String value) {
        this.cue = value;
    }

    /**
     * Gets the value of the cueAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCueAfter() {
        return cueAfter;
    }

    /**
     * Sets the value of the cueAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCueAfter(String value) {
        this.cueAfter = value;
    }

    /**
     * Gets the value of the cueBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCueBefore() {
        return cueBefore;
    }

    /**
     * Sets the value of the cueBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCueBefore(String value) {
        this.cueBefore = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElevation(String value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the pause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPause() {
        return pause;
    }

    /**
     * Sets the value of the pause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPause(String value) {
        this.pause = value;
    }

    /**
     * Gets the value of the pauseAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseAfter() {
        return pauseAfter;
    }

    /**
     * Sets the value of the pauseAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseAfter(String value) {
        this.pauseAfter = value;
    }

    /**
     * Gets the value of the pauseBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseBefore() {
        return pauseBefore;
    }

    /**
     * Sets the value of the pauseBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseBefore(String value) {
        this.pauseBefore = value;
    }

    /**
     * Gets the value of the pitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitch(String value) {
        this.pitch = value;
    }

    /**
     * Gets the value of the pitchRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitchRange() {
        return pitchRange;
    }

    /**
     * Sets the value of the pitchRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitchRange(String value) {
        this.pitchRange = value;
    }

    /**
     * Gets the value of the playDuring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayDuring() {
        return playDuring;
    }

    /**
     * Sets the value of the playDuring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayDuring(String value) {
        this.playDuring = value;
    }

    /**
     * Gets the value of the richness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRichness() {
        return richness;
    }

    /**
     * Sets the value of the richness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRichness(String value) {
        this.richness = value;
    }

    /**
     * Gets the value of the speak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeak() {
        return speak;
    }

    /**
     * Sets the value of the speak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeak(String value) {
        this.speak = value;
    }

    /**
     * Gets the value of the speakHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakHeader() {
        return speakHeader;
    }

    /**
     * Sets the value of the speakHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakHeader(String value) {
        this.speakHeader = value;
    }

    /**
     * Gets the value of the speakNumeral property.
     * 
     * @return
     *     possible object is
     *     {@link SpeakNumeralType }
     *     
     */
    public SpeakNumeralType getSpeakNumeral() {
        return speakNumeral;
    }

    /**
     * Sets the value of the speakNumeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeakNumeralType }
     *     
     */
    public void setSpeakNumeral(SpeakNumeralType value) {
        this.speakNumeral = value;
    }

    /**
     * Gets the value of the speakPunctuation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeakPunctuation() {
        return speakPunctuation;
    }

    /**
     * Sets the value of the speakPunctuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeakPunctuation(String value) {
        this.speakPunctuation = value;
    }

    /**
     * Gets the value of the speechRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeechRate() {
        return speechRate;
    }

    /**
     * Sets the value of the speechRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeechRate(String value) {
        this.speechRate = value;
    }

    /**
     * Gets the value of the stress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStress() {
        return stress;
    }

    /**
     * Sets the value of the stress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStress(String value) {
        this.stress = value;
    }

    /**
     * Gets the value of the voiceFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceFamily() {
        return voiceFamily;
    }

    /**
     * Sets the value of the voiceFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceFamily(String value) {
        this.voiceFamily = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the sourceDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDocument() {
        return sourceDocument;
    }

    /**
     * Sets the value of the sourceDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDocument(String value) {
        this.sourceDocument = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the borderBeforeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBeforeColor() {
        return borderBeforeColor;
    }

    /**
     * Sets the value of the borderBeforeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBeforeColor(String value) {
        this.borderBeforeColor = value;
    }

    /**
     * Gets the value of the borderBeforeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderBeforeStyle() {
        return borderBeforeStyle;
    }

    /**
     * Sets the value of the borderBeforeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderBeforeStyle(BorderStyleType value) {
        this.borderBeforeStyle = value;
    }

    /**
     * Gets the value of the borderBeforeWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBeforeWidth() {
        return borderBeforeWidth;
    }

    /**
     * Sets the value of the borderBeforeWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBeforeWidth(String value) {
        this.borderBeforeWidth = value;
    }

    /**
     * Gets the value of the borderBeforeWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBeforeWidthLength() {
        return borderBeforeWidthLength;
    }

    /**
     * Sets the value of the borderBeforeWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBeforeWidthLength(String value) {
        this.borderBeforeWidthLength = value;
    }

    /**
     * Gets the value of the borderBeforeWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderBeforeWidthConditionality() {
        return borderBeforeWidthConditionality;
    }

    /**
     * Sets the value of the borderBeforeWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderBeforeWidthConditionality(ConditionalityType value) {
        this.borderBeforeWidthConditionality = value;
    }

    /**
     * Gets the value of the borderAfterColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderAfterColor() {
        return borderAfterColor;
    }

    /**
     * Sets the value of the borderAfterColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderAfterColor(String value) {
        this.borderAfterColor = value;
    }

    /**
     * Gets the value of the borderAfterStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderAfterStyle() {
        return borderAfterStyle;
    }

    /**
     * Sets the value of the borderAfterStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderAfterStyle(BorderStyleType value) {
        this.borderAfterStyle = value;
    }

    /**
     * Gets the value of the borderAfterWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderAfterWidth() {
        return borderAfterWidth;
    }

    /**
     * Sets the value of the borderAfterWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderAfterWidth(String value) {
        this.borderAfterWidth = value;
    }

    /**
     * Gets the value of the borderAfterWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderAfterWidthLength() {
        return borderAfterWidthLength;
    }

    /**
     * Sets the value of the borderAfterWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderAfterWidthLength(String value) {
        this.borderAfterWidthLength = value;
    }

    /**
     * Gets the value of the borderAfterWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderAfterWidthConditionality() {
        return borderAfterWidthConditionality;
    }

    /**
     * Sets the value of the borderAfterWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderAfterWidthConditionality(ConditionalityType value) {
        this.borderAfterWidthConditionality = value;
    }

    /**
     * Gets the value of the borderStartColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderStartColor() {
        return borderStartColor;
    }

    /**
     * Sets the value of the borderStartColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderStartColor(String value) {
        this.borderStartColor = value;
    }

    /**
     * Gets the value of the borderStartStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderStartStyle() {
        return borderStartStyle;
    }

    /**
     * Sets the value of the borderStartStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderStartStyle(BorderStyleType value) {
        this.borderStartStyle = value;
    }

    /**
     * Gets the value of the borderStartWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderStartWidth() {
        return borderStartWidth;
    }

    /**
     * Sets the value of the borderStartWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderStartWidth(String value) {
        this.borderStartWidth = value;
    }

    /**
     * Gets the value of the borderStartWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderStartWidthLength() {
        return borderStartWidthLength;
    }

    /**
     * Sets the value of the borderStartWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderStartWidthLength(String value) {
        this.borderStartWidthLength = value;
    }

    /**
     * Gets the value of the borderStartWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderStartWidthConditionality() {
        return borderStartWidthConditionality;
    }

    /**
     * Sets the value of the borderStartWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderStartWidthConditionality(ConditionalityType value) {
        this.borderStartWidthConditionality = value;
    }

    /**
     * Gets the value of the borderEndColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderEndColor() {
        return borderEndColor;
    }

    /**
     * Sets the value of the borderEndColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderEndColor(String value) {
        this.borderEndColor = value;
    }

    /**
     * Gets the value of the borderEndStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderEndStyle() {
        return borderEndStyle;
    }

    /**
     * Sets the value of the borderEndStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderEndStyle(BorderStyleType value) {
        this.borderEndStyle = value;
    }

    /**
     * Gets the value of the borderEndWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderEndWidth() {
        return borderEndWidth;
    }

    /**
     * Sets the value of the borderEndWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderEndWidth(String value) {
        this.borderEndWidth = value;
    }

    /**
     * Gets the value of the borderEndWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderEndWidthLength() {
        return borderEndWidthLength;
    }

    /**
     * Sets the value of the borderEndWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderEndWidthLength(String value) {
        this.borderEndWidthLength = value;
    }

    /**
     * Gets the value of the borderEndWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderEndWidthConditionality() {
        return borderEndWidthConditionality;
    }

    /**
     * Sets the value of the borderEndWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderEndWidthConditionality(ConditionalityType value) {
        this.borderEndWidthConditionality = value;
    }

    /**
     * Gets the value of the borderTopColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTopColor() {
        return borderTopColor;
    }

    /**
     * Sets the value of the borderTopColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTopColor(String value) {
        this.borderTopColor = value;
    }

    /**
     * Gets the value of the borderTopStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderTopStyle() {
        return borderTopStyle;
    }

    /**
     * Sets the value of the borderTopStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderTopStyle(BorderStyleType value) {
        this.borderTopStyle = value;
    }

    /**
     * Gets the value of the borderTopWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTopWidth() {
        return borderTopWidth;
    }

    /**
     * Sets the value of the borderTopWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTopWidth(String value) {
        this.borderTopWidth = value;
    }

    /**
     * Gets the value of the borderTopWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTopWidthLength() {
        return borderTopWidthLength;
    }

    /**
     * Sets the value of the borderTopWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTopWidthLength(String value) {
        this.borderTopWidthLength = value;
    }

    /**
     * Gets the value of the borderTopWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderTopWidthConditionality() {
        return borderTopWidthConditionality;
    }

    /**
     * Sets the value of the borderTopWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderTopWidthConditionality(ConditionalityType value) {
        this.borderTopWidthConditionality = value;
    }

    /**
     * Gets the value of the borderBottomColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottomColor() {
        return borderBottomColor;
    }

    /**
     * Sets the value of the borderBottomColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottomColor(String value) {
        this.borderBottomColor = value;
    }

    /**
     * Gets the value of the borderBottomStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderBottomStyle() {
        return borderBottomStyle;
    }

    /**
     * Sets the value of the borderBottomStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderBottomStyle(BorderStyleType value) {
        this.borderBottomStyle = value;
    }

    /**
     * Gets the value of the borderBottomWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottomWidth() {
        return borderBottomWidth;
    }

    /**
     * Sets the value of the borderBottomWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottomWidth(String value) {
        this.borderBottomWidth = value;
    }

    /**
     * Gets the value of the borderBottomWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottomWidthLength() {
        return borderBottomWidthLength;
    }

    /**
     * Sets the value of the borderBottomWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottomWidthLength(String value) {
        this.borderBottomWidthLength = value;
    }

    /**
     * Gets the value of the borderBottomWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderBottomWidthConditionality() {
        return borderBottomWidthConditionality;
    }

    /**
     * Sets the value of the borderBottomWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderBottomWidthConditionality(ConditionalityType value) {
        this.borderBottomWidthConditionality = value;
    }

    /**
     * Gets the value of the borderLeftColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeftColor() {
        return borderLeftColor;
    }

    /**
     * Sets the value of the borderLeftColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeftColor(String value) {
        this.borderLeftColor = value;
    }

    /**
     * Gets the value of the borderLeftStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderLeftStyle() {
        return borderLeftStyle;
    }

    /**
     * Sets the value of the borderLeftStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderLeftStyle(BorderStyleType value) {
        this.borderLeftStyle = value;
    }

    /**
     * Gets the value of the borderLeftWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeftWidth() {
        return borderLeftWidth;
    }

    /**
     * Sets the value of the borderLeftWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeftWidth(String value) {
        this.borderLeftWidth = value;
    }

    /**
     * Gets the value of the borderLeftWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeftWidthLength() {
        return borderLeftWidthLength;
    }

    /**
     * Sets the value of the borderLeftWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeftWidthLength(String value) {
        this.borderLeftWidthLength = value;
    }

    /**
     * Gets the value of the borderLeftWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderLeftWidthConditionality() {
        return borderLeftWidthConditionality;
    }

    /**
     * Sets the value of the borderLeftWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderLeftWidthConditionality(ConditionalityType value) {
        this.borderLeftWidthConditionality = value;
    }

    /**
     * Gets the value of the borderRightColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRightColor() {
        return borderRightColor;
    }

    /**
     * Sets the value of the borderRightColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRightColor(String value) {
        this.borderRightColor = value;
    }

    /**
     * Gets the value of the borderRightStyle property.
     * 
     * @return
     *     possible object is
     *     {@link BorderStyleType }
     *     
     */
    public BorderStyleType getBorderRightStyle() {
        return borderRightStyle;
    }

    /**
     * Sets the value of the borderRightStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderStyleType }
     *     
     */
    public void setBorderRightStyle(BorderStyleType value) {
        this.borderRightStyle = value;
    }

    /**
     * Gets the value of the borderRightWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRightWidth() {
        return borderRightWidth;
    }

    /**
     * Sets the value of the borderRightWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRightWidth(String value) {
        this.borderRightWidth = value;
    }

    /**
     * Gets the value of the borderRightWidthLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRightWidthLength() {
        return borderRightWidthLength;
    }

    /**
     * Sets the value of the borderRightWidthLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRightWidthLength(String value) {
        this.borderRightWidthLength = value;
    }

    /**
     * Gets the value of the borderRightWidthConditionality property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionalityType }
     *     
     */
    public ConditionalityType getBorderRightWidthConditionality() {
        return borderRightWidthConditionality;
    }

    /**
     * Sets the value of the borderRightWidthConditionality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionalityType }
     *     
     */
    public void setBorderRightWidthConditionality(ConditionalityType value) {
        this.borderRightWidthConditionality = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the backgroundAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundAttachmentType }
     *     
     */
    public BackgroundAttachmentType getBackgroundAttachment() {
        return backgroundAttachment;
    }

    /**
     * Sets the value of the backgroundAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundAttachmentType }
     *     
     */
    public void setBackgroundAttachment(BackgroundAttachmentType value) {
        this.backgroundAttachment = value;
    }

    /**
     * Gets the value of the backgroundImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the value of the backgroundImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Gets the value of the backgroundRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundRepeatType }
     *     
     */
    public BackgroundRepeatType getBackgroundRepeat() {
        return backgroundRepeat;
    }

    /**
     * Sets the value of the backgroundRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundRepeatType }
     *     
     */
    public void setBackgroundRepeat(BackgroundRepeatType value) {
        this.backgroundRepeat = value;
    }

    /**
     * Gets the value of the backgroundPositionHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundPositionHorizontal() {
        return backgroundPositionHorizontal;
    }

    /**
     * Sets the value of the backgroundPositionHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundPositionHorizontal(String value) {
        this.backgroundPositionHorizontal = value;
    }

    /**
     * Gets the value of the backgroundPositionVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundPositionVertical() {
        return backgroundPositionVertical;
    }

    /**
     * Sets the value of the backgroundPositionVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundPositionVertical(String value) {
        this.backgroundPositionVertical = value;
    }

    /**
     * Gets the value of the breakAfter property.
     * 
     * @return
     *     possible object is
     *     {@link BreaksType }
     *     
     */
    public BreaksType getBreakAfter() {
        return breakAfter;
    }

    /**
     * Sets the value of the breakAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreaksType }
     *     
     */
    public void setBreakAfter(BreaksType value) {
        this.breakAfter = value;
    }

    /**
     * Gets the value of the breakBefore property.
     * 
     * @return
     *     possible object is
     *     {@link BreaksType }
     *     
     */
    public BreaksType getBreakBefore() {
        return breakBefore;
    }

    /**
     * Sets the value of the breakBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreaksType }
     *     
     */
    public void setBreakBefore(BreaksType value) {
        this.breakBefore = value;
    }

    /**
     * Gets the value of the autoRestore property.
     * 
     * @return
     *     possible object is
     *     {@link AutoRestoreType }
     *     
     */
    public AutoRestoreType getAutoRestore() {
        return autoRestore;
    }

    /**
     * Sets the value of the autoRestore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoRestoreType }
     *     
     */
    public void setAutoRestore(AutoRestoreType value) {
        this.autoRestore = value;
    }

    /**
     * Gets the value of the background property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the background property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackground().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBackground() {
        if (background == null) {
            background = new ArrayList<String>();
        }
        return this.background;
    }

    /**
     * Gets the value of the borderSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderSpacing() {
        return borderSpacing;
    }

    /**
     * Sets the value of the borderSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderSpacing(String value) {
        this.borderSpacing = value;
    }

    /**
     * Gets the value of the captionSide property.
     * 
     * @return
     *     possible object is
     *     {@link CaptionSideType }
     *     
     */
    public CaptionSideType getCaptionSide() {
        return captionSide;
    }

    /**
     * Sets the value of the captionSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptionSideType }
     *     
     */
    public void setCaptionSide(CaptionSideType value) {
        this.captionSide = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionType }
     *     
     */
    public DirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionType }
     *     
     */
    public void setDirection(DirectionType value) {
        this.direction = value;
    }

    /**
     * Gets the value of the emptyCells property.
     * 
     * @return
     *     possible object is
     *     {@link EmptyCellsType }
     *     
     */
    public EmptyCellsType getEmptyCells() {
        return emptyCells;
    }

    /**
     * Sets the value of the emptyCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmptyCellsType }
     *     
     */
    public void setEmptyCells(EmptyCellsType value) {
        this.emptyCells = value;
    }

    /**
     * Gets the value of the font property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFont() {
        return font;
    }

    /**
     * Sets the value of the font property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFont(String value) {
        this.font = value;
    }

    /**
     * Gets the value of the fontSelectionStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link FontSelectionStrategyType }
     *     
     */
    public FontSelectionStrategyType getFontSelectionStrategy() {
        return fontSelectionStrategy;
    }

    /**
     * Sets the value of the fontSelectionStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontSelectionStrategyType }
     *     
     */
    public void setFontSelectionStrategy(FontSelectionStrategyType value) {
        this.fontSelectionStrategy = value;
    }

    /**
     * Gets the value of the fontSizeAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSizeAdjust() {
        return fontSizeAdjust;
    }

    /**
     * Sets the value of the fontSizeAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSizeAdjust(String value) {
        this.fontSizeAdjust = value;
    }

    /**
     * Gets the value of the fontStretch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontStretch() {
        return fontStretch;
    }

    /**
     * Sets the value of the fontStretch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontStretch(String value) {
        this.fontStretch = value;
    }

    /**
     * Gets the value of the fontVariant property.
     * 
     * @return
     *     possible object is
     *     {@link FontVariantType }
     *     
     */
    public FontVariantType getFontVariant() {
        return fontVariant;
    }

    /**
     * Sets the value of the fontVariant property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontVariantType }
     *     
     */
    public void setFontVariant(FontVariantType value) {
        this.fontVariant = value;
    }

    /**
     * Gets the value of the glyphOrientationVertical property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlyphOrientationVertical() {
        return glyphOrientationVertical;
    }

    /**
     * Sets the value of the glyphOrientationVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlyphOrientationVertical(String value) {
        this.glyphOrientationVertical = value;
    }

    /**
     * Gets the value of the glyphOrientationHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlyphOrientationHorizontal() {
        return glyphOrientationHorizontal;
    }

    /**
     * Sets the value of the glyphOrientationHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlyphOrientationHorizontal(String value) {
        this.glyphOrientationHorizontal = value;
    }

    /**
     * Gets the value of the hyphenationKeep property.
     * 
     * @return
     *     possible object is
     *     {@link HyphenationKeepType }
     *     
     */
    public HyphenationKeepType getHyphenationKeep() {
        return hyphenationKeep;
    }

    /**
     * Sets the value of the hyphenationKeep property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyphenationKeepType }
     *     
     */
    public void setHyphenationKeep(HyphenationKeepType value) {
        this.hyphenationKeep = value;
    }

    /**
     * Gets the value of the hyphenationLadderCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationLadderCount() {
        return hyphenationLadderCount;
    }

    /**
     * Sets the value of the hyphenationLadderCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationLadderCount(String value) {
        this.hyphenationLadderCount = value;
    }

    /**
     * Gets the value of the intrusionDisplace property.
     * 
     * @return
     *     possible object is
     *     {@link DisplaceType }
     *     
     */
    public DisplaceType getIntrusionDisplace() {
        return intrusionDisplace;
    }

    /**
     * Sets the value of the intrusionDisplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplaceType }
     *     
     */
    public void setIntrusionDisplace(DisplaceType value) {
        this.intrusionDisplace = value;
    }

    /**
     * Gets the value of the lastLineEndIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLineEndIndent() {
        return lastLineEndIndent;
    }

    /**
     * Sets the value of the lastLineEndIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLineEndIndent(String value) {
        this.lastLineEndIndent = value;
    }

    /**
     * Gets the value of the lineHeightShiftAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link LineHeightShiftAdjustmentType }
     *     
     */
    public LineHeightShiftAdjustmentType getLineHeightShiftAdjustment() {
        return lineHeightShiftAdjustment;
    }

    /**
     * Sets the value of the lineHeightShiftAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineHeightShiftAdjustmentType }
     *     
     */
    public void setLineHeightShiftAdjustment(LineHeightShiftAdjustmentType value) {
        this.lineHeightShiftAdjustment = value;
    }

    /**
     * Gets the value of the lineStackingStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link LineStackingStrategyType }
     *     
     */
    public LineStackingStrategyType getLineStackingStrategy() {
        return lineStackingStrategy;
    }

    /**
     * Sets the value of the lineStackingStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStackingStrategyType }
     *     
     */
    public void setLineStackingStrategy(LineStackingStrategyType value) {
        this.lineStackingStrategy = value;
    }

    /**
     * Gets the value of the linefeedTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link LinefeedTreatmentType }
     *     
     */
    public LinefeedTreatmentType getLinefeedTreatment() {
        return linefeedTreatment;
    }

    /**
     * Sets the value of the linefeedTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinefeedTreatmentType }
     *     
     */
    public void setLinefeedTreatment(LinefeedTreatmentType value) {
        this.linefeedTreatment = value;
    }

    /**
     * Gets the value of the margin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the margin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMargin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMargin() {
        if (margin == null) {
            margin = new ArrayList<String>();
        }
        return this.margin;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWidth(String value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the minHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeight() {
        return minHeight;
    }

    /**
     * Sets the value of the minHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeight(String value) {
        this.minHeight = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinWidth(String value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the pageBreakInside property.
     * 
     * @return
     *     possible object is
     *     {@link PageBreakInsideType }
     *     
     */
    public PageBreakInsideType getPageBreakInside() {
        return pageBreakInside;
    }

    /**
     * Sets the value of the pageBreakInside property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageBreakInsideType }
     *     
     */
    public void setPageBreakInside(PageBreakInsideType value) {
        this.pageBreakInside = value;
    }

    /**
     * Gets the value of the referenceOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceOrientation() {
        return referenceOrientation;
    }

    /**
     * Sets the value of the referenceOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceOrientation(String value) {
        this.referenceOrientation = value;
    }

    /**
     * Gets the value of the scoreSpaces property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreSpacesType }
     *     
     */
    public ScoreSpacesType getScoreSpaces() {
        return scoreSpaces;
    }

    /**
     * Sets the value of the scoreSpaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreSpacesType }
     *     
     */
    public void setScoreSpaces(ScoreSpacesType value) {
        this.scoreSpaces = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the textTransform property.
     * 
     * @return
     *     possible object is
     *     {@link TextTransformType }
     *     
     */
    public TextTransformType getTextTransform() {
        return textTransform;
    }

    /**
     * Sets the value of the textTransform property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextTransformType }
     *     
     */
    public void setTextTransform(TextTransformType value) {
        this.textTransform = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityType }
     *     
     */
    public VisibilityType getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibilityType }
     *     
     */
    public void setVisibility(VisibilityType value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the whiteSpace property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteSpaceType }
     *     
     */
    public WhiteSpaceType getWhiteSpace() {
        return whiteSpace;
    }

    /**
     * Sets the value of the whiteSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteSpaceType }
     *     
     */
    public void setWhiteSpace(WhiteSpaceType value) {
        this.whiteSpace = value;
    }

    /**
     * Gets the value of the whiteSpaceTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteSpaceTreatmentType }
     *     
     */
    public WhiteSpaceTreatmentType getWhiteSpaceTreatment() {
        return whiteSpaceTreatment;
    }

    /**
     * Sets the value of the whiteSpaceTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteSpaceTreatmentType }
     *     
     */
    public void setWhiteSpaceTreatment(WhiteSpaceTreatmentType value) {
        this.whiteSpaceTreatment = value;
    }

    /**
     * Gets the value of the wordSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordSpacing() {
        return wordSpacing;
    }

    /**
     * Sets the value of the wordSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordSpacing(String value) {
        this.wordSpacing = value;
    }

    /**
     * Gets the value of the writingMode property.
     * 
     * @return
     *     possible object is
     *     {@link WritingModeType }
     *     
     */
    public WritingModeType getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WritingModeType }
     *     
     */
    public void setWritingMode(WritingModeType value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the borderBottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderBottom() {
        return borderBottom;
    }

    /**
     * Sets the value of the borderBottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderBottom(String value) {
        this.borderBottom = value;
    }

    /**
     * Gets the value of the borderCollapse property.
     * 
     * @return
     *     possible object is
     *     {@link BorderCollapseType }
     *     
     */
    public BorderCollapseType getBorderCollapse() {
        return borderCollapse;
    }

    /**
     * Sets the value of the borderCollapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorderCollapseType }
     *     
     */
    public void setBorderCollapse(BorderCollapseType value) {
        this.borderCollapse = value;
    }

    /**
     * Gets the value of the borderColor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borderColor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderColor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderColor() {
        if (borderColor == null) {
            borderColor = new ArrayList<String>();
        }
        return this.borderColor;
    }

    /**
     * Gets the value of the borderLeft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderLeft() {
        return borderLeft;
    }

    /**
     * Sets the value of the borderLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderLeft(String value) {
        this.borderLeft = value;
    }

    /**
     * Gets the value of the borderRight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderRight() {
        return borderRight;
    }

    /**
     * Sets the value of the borderRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderRight(String value) {
        this.borderRight = value;
    }

    /**
     * Gets the value of the borderSeparation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borderSeparation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderSeparation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderSeparation() {
        if (borderSeparation == null) {
            borderSeparation = new ArrayList<String>();
        }
        return this.borderSeparation;
    }

    /**
     * Gets the value of the borderStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borderStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BorderStyleType }
     * 
     * 
     */
    public List<BorderStyleType> getBorderStyle() {
        if (borderStyle == null) {
            borderStyle = new ArrayList<BorderStyleType>();
        }
        return this.borderStyle;
    }

    /**
     * Gets the value of the borderTop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderTop() {
        return borderTop;
    }

    /**
     * Sets the value of the borderTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderTop(String value) {
        this.borderTop = value;
    }

    /**
     * Gets the value of the borderWidth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the borderWidth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderWidth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBorderWidth() {
        if (borderWidth == null) {
            borderWidth = new ArrayList<String>();
        }
        return this.borderWidth;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the displayAlign property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAlignType }
     *     
     */
    public DisplayAlignType getDisplayAlign() {
        return displayAlign;
    }

    /**
     * Sets the value of the displayAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAlignType }
     *     
     */
    public void setDisplayAlign(DisplayAlignType value) {
        this.displayAlign = value;
    }

    /**
     * Gets the value of the endIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndIndent() {
        return endIndent;
    }

    /**
     * Sets the value of the endIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndIndent(String value) {
        this.endIndent = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyleType }
     *     
     */
    public FontStyleType getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyleType }
     *     
     */
    public void setFontStyle(FontStyleType value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontWeight(String value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the hyphenate property.
     * 
     * @return
     *     possible object is
     *     {@link HyphenateType }
     *     
     */
    public HyphenateType getHyphenate() {
        return hyphenate;
    }

    /**
     * Sets the value of the hyphenate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyphenateType }
     *     
     */
    public void setHyphenate(HyphenateType value) {
        this.hyphenate = value;
    }

    /**
     * Gets the value of the hyphenationCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationCharacter() {
        return hyphenationCharacter;
    }

    /**
     * Sets the value of the hyphenationCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationCharacter(String value) {
        this.hyphenationCharacter = value;
    }

    /**
     * Gets the value of the hyphenationPushCharacterCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationPushCharacterCount() {
        return hyphenationPushCharacterCount;
    }

    /**
     * Sets the value of the hyphenationPushCharacterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationPushCharacterCount(String value) {
        this.hyphenationPushCharacterCount = value;
    }

    /**
     * Gets the value of the hyphenationRemainCharacterCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHyphenationRemainCharacterCount() {
        return hyphenationRemainCharacterCount;
    }

    /**
     * Sets the value of the hyphenationRemainCharacterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyphenationRemainCharacterCount(String value) {
        this.hyphenationRemainCharacterCount = value;
    }

    /**
     * Gets the value of the keepTogether property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keepTogether property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeepTogether().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeepTogether() {
        if (keepTogether == null) {
            keepTogether = new ArrayList<String>();
        }
        return this.keepTogether;
    }

    /**
     * Gets the value of the keepTogetherWithinColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogetherWithinColumn() {
        return keepTogetherWithinColumn;
    }

    /**
     * Sets the value of the keepTogetherWithinColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogetherWithinColumn(String value) {
        this.keepTogetherWithinColumn = value;
    }

    /**
     * Gets the value of the keepTogetherWithinLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogetherWithinLine() {
        return keepTogetherWithinLine;
    }

    /**
     * Sets the value of the keepTogetherWithinLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogetherWithinLine(String value) {
        this.keepTogetherWithinLine = value;
    }

    /**
     * Gets the value of the keepTogetherWithinPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeepTogetherWithinPage() {
        return keepTogetherWithinPage;
    }

    /**
     * Sets the value of the keepTogetherWithinPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeepTogetherWithinPage(String value) {
        this.keepTogetherWithinPage = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the leaderAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link LeaderAlignmentType }
     *     
     */
    public LeaderAlignmentType getLeaderAlignment() {
        return leaderAlignment;
    }

    /**
     * Sets the value of the leaderAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaderAlignmentType }
     *     
     */
    public void setLeaderAlignment(LeaderAlignmentType value) {
        this.leaderAlignment = value;
    }

    /**
     * Gets the value of the leaderLength property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaderLength property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaderLength().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLeaderLength() {
        if (leaderLength == null) {
            leaderLength = new ArrayList<String>();
        }
        return this.leaderLength;
    }

    /**
     * Gets the value of the leaderLengthMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderLengthMaximum() {
        return leaderLengthMaximum;
    }

    /**
     * Sets the value of the leaderLengthMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderLengthMaximum(String value) {
        this.leaderLengthMaximum = value;
    }

    /**
     * Gets the value of the leaderLengthMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderLengthMinimum() {
        return leaderLengthMinimum;
    }

    /**
     * Sets the value of the leaderLengthMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderLengthMinimum(String value) {
        this.leaderLengthMinimum = value;
    }

    /**
     * Gets the value of the leaderLengthOptimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderLengthOptimum() {
        return leaderLengthOptimum;
    }

    /**
     * Sets the value of the leaderLengthOptimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderLengthOptimum(String value) {
        this.leaderLengthOptimum = value;
    }

    /**
     * Gets the value of the leaderPattern property.
     * 
     * @return
     *     possible object is
     *     {@link LeaderPatternType }
     *     
     */
    public LeaderPatternType getLeaderPattern() {
        return leaderPattern;
    }

    /**
     * Sets the value of the leaderPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaderPatternType }
     *     
     */
    public void setLeaderPattern(LeaderPatternType value) {
        this.leaderPattern = value;
    }

    /**
     * Gets the value of the leaderPatternWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderPatternWidth() {
        return leaderPatternWidth;
    }

    /**
     * Sets the value of the leaderPatternWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderPatternWidth(String value) {
        this.leaderPatternWidth = value;
    }

    /**
     * Gets the value of the letterSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * Sets the value of the letterSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterSpacing(String value) {
        this.letterSpacing = value;
    }

    /**
     * Gets the value of the lineHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeight() {
        return lineHeight;
    }

    /**
     * Sets the value of the lineHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeight(String value) {
        this.lineHeight = value;
    }

    /**
     * Gets the value of the orphans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrphans() {
        return orphans;
    }

    /**
     * Sets the value of the orphans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrphans(String value) {
        this.orphans = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setPosition(PositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the provisionalDistanceBetweenStarts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionalDistanceBetweenStarts() {
        return provisionalDistanceBetweenStarts;
    }

    /**
     * Sets the value of the provisionalDistanceBetweenStarts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionalDistanceBetweenStarts(String value) {
        this.provisionalDistanceBetweenStarts = value;
    }

    /**
     * Gets the value of the provisionalLabelSeparation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisionalLabelSeparation() {
        return provisionalLabelSeparation;
    }

    /**
     * Sets the value of the provisionalLabelSeparation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionalLabelSeparation(String value) {
        this.provisionalLabelSeparation = value;
    }

    /**
     * Gets the value of the relativeAlign property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeAlignType }
     *     
     */
    public RelativeAlignType getRelativeAlign() {
        return relativeAlign;
    }

    /**
     * Sets the value of the relativeAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeAlignType }
     *     
     */
    public void setRelativeAlign(RelativeAlignType value) {
        this.relativeAlign = value;
    }

    /**
     * Gets the value of the ruleStyle property.
     * 
     * @return
     *     possible object is
     *     {@link RuleStyleType }
     *     
     */
    public RuleStyleType getRuleStyle() {
        return ruleStyle;
    }

    /**
     * Sets the value of the ruleStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleStyleType }
     *     
     */
    public void setRuleStyle(RuleStyleType value) {
        this.ruleStyle = value;
    }

    /**
     * Gets the value of the ruleThickness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleThickness() {
        return ruleThickness;
    }

    /**
     * Sets the value of the ruleThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleThickness(String value) {
        this.ruleThickness = value;
    }

    /**
     * Gets the value of the startIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartIndent() {
        return startIndent;
    }

    /**
     * Sets the value of the startIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartIndent(String value) {
        this.startIndent = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlignType }
     *     
     */
    public TextAlignType getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlignType }
     *     
     */
    public void setTextAlign(TextAlignType value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the textAlignLast property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlignLastType }
     *     
     */
    public TextAlignLastType getTextAlignLast() {
        return textAlignLast;
    }

    /**
     * Sets the value of the textAlignLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlignLastType }
     *     
     */
    public void setTextAlignLast(TextAlignLastType value) {
        this.textAlignLast = value;
    }

    /**
     * Gets the value of the textIndent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextIndent() {
        return textIndent;
    }

    /**
     * Sets the value of the textIndent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextIndent(String value) {
        this.textIndent = value;
    }

    /**
     * Gets the value of the whiteSpaceCollapse property.
     * 
     * @return
     *     possible object is
     *     {@link WhiteSpaceCollapseType }
     *     
     */
    public WhiteSpaceCollapseType getWhiteSpaceCollapse() {
        return whiteSpaceCollapse;
    }

    /**
     * Sets the value of the whiteSpaceCollapse property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhiteSpaceCollapseType }
     *     
     */
    public void setWhiteSpaceCollapse(WhiteSpaceCollapseType value) {
        this.whiteSpaceCollapse = value;
    }

    /**
     * Gets the value of the widows property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidows() {
        return widows;
    }

    /**
     * Sets the value of the widows property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidows(String value) {
        this.widows = value;
    }

    /**
     * Gets the value of the wrapOption property.
     * 
     * @return
     *     possible object is
     *     {@link WrapOptionType }
     *     
     */
    public WrapOptionType getWrapOption() {
        return wrapOption;
    }

    /**
     * Sets the value of the wrapOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrapOptionType }
     *     
     */
    public void setWrapOption(WrapOptionType value) {
        this.wrapOption = value;
    }

    /**
     * Gets the value of the relativePosition property.
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * Sets the value of the relativePosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTop(String value) {
        this.top = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRight() {
        return right;
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRight(String value) {
        this.right = value;
    }

    /**
     * Gets the value of the bottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottom() {
        return bottom;
    }

    /**
     * Sets the value of the bottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottom(String value) {
        this.bottom = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeft(String value) {
        this.left = value;
    }

}

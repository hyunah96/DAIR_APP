package dji.v5.ux.core.base.panel.listitem;

import java.lang.System;

/**
 * This is the base class to be used for radio button type list item
 * The class represents the item with icon, item name and radio group options
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000 I*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0002IJB-\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\u0010\u00100\u001a\u00020\n2\u0006\u00101\u001a\u000202H\u0004J\f\u00103\u001a\b\u0012\u0004\u0012\u00020-04J\u001a\u00105\u001a\u0002062\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0003J\u001a\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010*2\u0006\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u000206H\u0016J\u0018\u0010;\u001a\u0002062\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u000202H&J\u0010\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020\nH\u0004J\b\u0010@\u001a\u000206H\u0002J\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u0002062\b\b\u0001\u0010E\u001a\u00020\nJ\u0018\u0010F\u001a\u0002062\u0006\u0010?\u001a\u00020\n2\u0006\u0010G\u001a\u000202H\u0004J\u0010\u0010H\u001a\u0002062\u0006\u0010?\u001a\u00020\nH\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020#@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/\u00a8\u0006K"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget;", "T", "", "Ldji/v5/ux/core/base/panel/listitem/ListItemTitleWidget;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defaultStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "centerOptionBackgroundSelector", "Landroid/graphics/drawable/Drawable;", "getCenterOptionBackgroundSelector", "()Landroid/graphics/drawable/Drawable;", "setCenterOptionBackgroundSelector", "(Landroid/graphics/drawable/Drawable;)V", "firstOptionBackgroundSelector", "getFirstOptionBackgroundSelector", "setFirstOptionBackgroundSelector", "lastOptionBackgroundSelector", "getLastOptionBackgroundSelector", "setLastOptionBackgroundSelector", "value", "Landroid/content/res/ColorStateList;", "optionColorStateList", "getOptionColorStateList", "()Landroid/content/res/ColorStateList;", "setOptionColorStateList", "(Landroid/content/res/ColorStateList;)V", "optionCount", "getOptionCount", "()I", "", "optionTextSize", "getOptionTextSize", "()F", "setOptionTextSize", "(F)V", "radioGroup", "Landroid/widget/RadioGroup;", "uiUpdateStateProcessor", "Lio/reactivex/rxjava3/processors/PublishProcessor;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "getUiUpdateStateProcessor", "()Lio/reactivex/rxjava3/processors/PublishProcessor;", "addOptionToGroup", "label", "", "getUIStateUpdates", "Lio/reactivex/rxjava3/core/Flowable;", "initAttributes", "", "onCheckedChanged", "group", "radioButtonId", "onListItemClick", "onOptionTapped", "optionIndex", "optionLabel", "removeOptionFromGroup", "index", "restyleRadioGroup", "setEnabled", "enabled", "", "setOptionTextAppearance", "textAppearance", "setOptionTextByIndex", "text", "setSelected", "Companion", "UIState", "android-sdk-v5-uxsdk_debug"})
public abstract class ListItemRadioButtonWidget<T extends java.lang.Object> extends dji.v5.ux.core.base.panel.listitem.ListItemTitleWidget<T> implements android.widget.RadioGroup.OnCheckedChangeListener {
    @org.jetbrains.annotations.NotNull
    private final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState> uiUpdateStateProcessor = null;
    private final android.widget.RadioGroup radioGroup = null;
    
    /**
     * Background selector of radio button in center
     *
     * Recommended states in selector
     * 1. android_state_enabled = false
     * 2. android_state_checked = false
     * 3. android_state_checked = true
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable centerOptionBackgroundSelector;
    
    /**
     * Background selector of radio button on the extreme left
     * i.e. the first item
     *
     * Recommended states in selector
     * 1. android_state_enabled = false
     * 2. android_state_checked = false
     * 3. android_state_checked = true
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable firstOptionBackgroundSelector;
    
    /**
     * Background selector of radio button on the extreme right
     * i.e. the last item
     *
     * Recommended states in selector
     * 1. android_state_enabled = false
     * 2. android_state_checked = false
     * 3. android_state_checked = true
     */
    @org.jetbrains.annotations.Nullable
    private android.graphics.drawable.Drawable lastOptionBackgroundSelector;
    
    /**
     * Text color state list for radio button text
     *
     * Recommended states in selector
     * 1. android_state_enabled = false
     * 2. android_state_checked = false
     * 3. android_state_checked = true
     */
    @org.jetbrains.annotations.Nullable
    private android.content.res.ColorStateList optionColorStateList;
    
    /**
     * Text size for the radio button text
     */
    private float optionTextSize;
    
    /**
     * The count of option items
     */
    private final int optionCount = 0;
    @org.jetbrains.annotations.NotNull
    protected static final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.Companion Companion = null;
    public static final int INVALID_OPTION_INDEX = -1;
    
    @kotlin.jvm.JvmOverloads
    public ListItemRadioButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemRadioButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @kotlin.jvm.JvmOverloads
    public ListItemRadioButtonWidget(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs, int defStyleAttr, int defaultStyle) {
        super(null, null, 0, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final io.reactivex.rxjava3.processors.PublishProcessor<dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState> getUiUpdateStateProcessor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getCenterOptionBackgroundSelector() {
        return null;
    }
    
    public final void setCenterOptionBackgroundSelector(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getFirstOptionBackgroundSelector() {
        return null;
    }
    
    public final void setFirstOptionBackgroundSelector(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.drawable.Drawable getLastOptionBackgroundSelector() {
        return null;
    }
    
    public final void setLastOptionBackgroundSelector(@org.jetbrains.annotations.Nullable
    android.graphics.drawable.Drawable p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.res.ColorStateList getOptionColorStateList() {
        return null;
    }
    
    public final void setOptionColorStateList(@org.jetbrains.annotations.Nullable
    android.content.res.ColorStateList value) {
    }
    
    public final float getOptionTextSize() {
        return 0.0F;
    }
    
    public final void setOptionTextSize(float value) {
    }
    
    public final int getOptionCount() {
        return 0;
    }
    
    /**
     * Get the [UIState] updates
     */
    @org.jetbrains.annotations.NotNull
    public final io.reactivex.rxjava3.core.Flowable<dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState> getUIStateUpdates() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"Recycle"})
    private final void initAttributes(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    protected final int addOptionToGroup(@org.jetbrains.annotations.NotNull
    java.lang.String label) {
        return 0;
    }
    
    protected final void removeOptionFromGroup(int index) {
    }
    
    protected final void setSelected(int index) {
    }
    
    private final void restyleRadioGroup() {
    }
    
    @java.lang.Override
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable
    android.widget.RadioGroup group, int radioButtonId) {
    }
    
    @java.lang.Override
    public void onListItemClick() {
    }
    
    @java.lang.Override
    public void setEnabled(boolean enabled) {
    }
    
    public abstract void onOptionTapped(int optionIndex, @org.jetbrains.annotations.NotNull
    java.lang.String optionLabel);
    
    /**
     * Set the text of the radio button by index
     */
    protected final void setOptionTextByIndex(int index, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    /**
     * Set the text of the radio button by index
     */
    public final void setOptionTextAppearance(@androidx.annotation.StyleRes
    int textAppearance) {
    }
    
    /**
     * Widget UI update State
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "", "()V", "DialogDismissed", "DialogDisplayed", "ListItemClicked", "NeverShowAgainCheckChanged", "OptionSelected", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$NeverShowAgainCheckChanged;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$OptionSelected;", "android-sdk-v5-uxsdk_debug"})
    public static abstract class UIState {
        
        private UIState() {
            super();
        }
        
        /**
         * List Item click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$ListItemClicked;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "()V", "android-sdk-v5-uxsdk_debug"})
        public static final class ListItemClicked extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState {
            @org.jetbrains.annotations.NotNull
            public static final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState.ListItemClicked INSTANCE = null;
            
            private ListItemClicked() {
                super();
            }
        }
        
        /**
         * Option click update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$OptionSelected;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "optionIndex", "", "optionLabel", "", "(ILjava/lang/String;)V", "getOptionIndex", "()I", "getOptionLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "android-sdk-v5-uxsdk_debug"})
        public static final class OptionSelected extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState {
            private final int optionIndex = 0;
            @org.jetbrains.annotations.NotNull
            private final java.lang.String optionLabel = null;
            
            /**
             * Option click update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState.OptionSelected copy(int optionIndex, @org.jetbrains.annotations.NotNull
            java.lang.String optionLabel) {
                return null;
            }
            
            /**
             * Option click update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Option click update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Option click update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public OptionSelected(int optionIndex, @org.jetbrains.annotations.NotNull
            java.lang.String optionLabel) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            public final int getOptionIndex() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.lang.String getOptionLabel() {
                return null;
            }
        }
        
        /**
         * Dialog shown update
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$DialogDisplayed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDisplayed extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState.DialogDisplayed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog shown update
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog shown update
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDisplayed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Dialog action dismiss
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$DialogDismissed;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "info", "", "(Ljava/lang/Object;)V", "getInfo", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class DialogDismissed extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState {
            @org.jetbrains.annotations.Nullable
            private final java.lang.Object info = null;
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState.DialogDismissed copy(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                return null;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Dialog action dismiss
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Dialog action dismiss
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public DialogDismissed(@org.jetbrains.annotations.Nullable
            java.lang.Object info) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object getInfo() {
                return null;
            }
        }
        
        /**
         * Never show again checkbox checked
         */
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u00d6\u0003J\t\u0010\u000b\u001a\u00020\fH\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u000f"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState$NeverShowAgainCheckChanged;", "Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$UIState;", "isChecked", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "android-sdk-v5-uxsdk_debug"})
        public static final class NeverShowAgainCheckChanged extends dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState {
            private final boolean isChecked = false;
            
            /**
             * Never show again checkbox checked
             */
            @org.jetbrains.annotations.NotNull
            public final dji.v5.ux.core.base.panel.listitem.ListItemRadioButtonWidget.UIState.NeverShowAgainCheckChanged copy(boolean isChecked) {
                return null;
            }
            
            /**
             * Never show again checkbox checked
             */
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            /**
             * Never show again checkbox checked
             */
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            /**
             * Never show again checkbox checked
             */
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public java.lang.String toString() {
                return null;
            }
            
            public NeverShowAgainCheckChanged(boolean isChecked) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            public final boolean isChecked() {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0084\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Ldji/v5/ux/core/base/panel/listitem/ListItemRadioButtonWidget$Companion;", "", "()V", "INVALID_OPTION_INDEX", "", "android-sdk-v5-uxsdk_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
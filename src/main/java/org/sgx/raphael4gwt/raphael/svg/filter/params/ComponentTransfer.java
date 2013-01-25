package org.sgx.raphael4gwt.raphael.svg.filter.params;

import org.sgx.raphael4gwt.raphael.jsutil.JsObject;

/**
 * This filter primitive performs component-wise remapping of data for every pixel. It allows operations like brightness adjustment, contrast adjustment, color balance or
 * thresholding.
 * 
 * @see http://www.w3.org/TR/SVG/filters.html#feComponentTransferElement
 * 
 * @author sg
 * 
 */
public class ComponentTransfer extends FilterOperationParam {
	protected ComponentTransfer() {
	}

	public static final native ComponentTransfer create()/*-{
		return {
			"_filterName" : "feComponentTransfer",

			feFuncR : {
				type : "linear",
				slope : 1.01
			},
			feFuncG : {
				type : "linear",
				intercept : 0.1
			},
			feFuncB : {
				type : "linear",
				slope : 1.11,
				intercept : 0.112
			}

		};
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Function funcR() /*-{
		return this.funcR;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ComponentTransfer funcR(Function val) /*-{
		this.feFuncR = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Function funcG() /*-{
		return this.feFuncG;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ComponentTransfer funcG(Function val) /*-{
		this.feFuncG = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final Function funcB() /*-{
		return this.feFuncB;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ComponentTransfer funcB(Function val) /*-{
		this.feFuncB = val;
		return this;
	}-*/;

	/**
	 * 
	 * @return
	 */
	public native final ComponentTransfer funcA() /*-{
		return this.feFuncA;
	}-*/;

	/**
	 * 
	 * @param val
	 * @return this - for setter chaining
	 */
	public native final ComponentTransfer funcA(ComponentTransfer val) /*-{
		this.feFuncA = val;
		return this;
	}-*/;

	
	
	
	
	
	
	//function
	
	
	
	/**
	 * component transfer function
	 * @author sg
	 * 
	 */
	public static class Function extends JsObject {
		protected Function() {
		}

		public static final native Function create()/*-{
			return {};
		}-*/;

		/**
		 * "identity | table | discrete | linear | gamma"
		 * <p>Indicates the type of component transfer function. The
	          type of function determines the applicability of the
	          other attributes.</p><p>In the following, C is the initial component (e.g.,
		  <a><span>‘feFuncR’</span></a>), C' is the remapped component; both
		  in the closed interval [0,1].</p><ul><li>
	              For <span>identity</span>: 
	<pre>C' = C
	</pre></li><li>
	              For <span>table</span>, the
	              function is defined by linear interpolation
		      between values given in the attribute
		      <a><span>‘tableValues’</span></a>. The table has <em>n+1</em>
		      values (i.e., v<sub>0</sub> to v<sub>n</sub>)
		      specifying the start and end values for <em>n</em>
		      evenly sized interpolation regions. Interpolations
		      use the following formula:

	              <p>For a value <code>C < 1</code> find <code>k</code>
	              such that:</p><p>k/n <= C < (k+1)/n</p><p>The result <code>C'</code> is given by:</p><p>C' = v<sub>k</sub> + (C -
	              k/n)*n * (v<sub>k+1</sub> - v<sub>k</sub>)</p><p>If <code>C = 1</code> then:</p><p>C' = v<sub>n</sub>.</p></li><li>
	              For <span>discrete</span>, the
	              function is defined by the step function given in the
	              attribute <a><span>‘tableValues’</span></a>, which
	              provides a list of <em>n</em> values (i.e.,
	              v<sub>0</sub> to v<sub>n-1</sub>) in order to
	              identify a step function consisting of <em>n</em>
	              steps. The step function is defined by the following
	              formula:

	              <p>For a value <code>C < 1</code> find <code>k</code>
	              such that:</p><p>k/n <= C < (k+1)/n</p><p>The result <code>C'</code> is given by:</p><p>C' = v<sub>k</sub></p><p>If <code>C = 1</code> then:</p><p>C' = v<sub>n-1</sub>.</p></li><li>
	              For <span>linear</span>, the
	              function is defined by the following linear equation:
	              
	              <p>C' = <a><span>slope</span></a> * C + <a><span>intercept</span></a></p></li><li>
	              For <span>gamma</span>, the
	              function is defined by the following exponential
	              function: 
	              <p>C' = <a><span>amplitude</span></a> * pow(C,
	              <a><span>exponent</span></a>) + <a><span>offset</span></a></p></li></ul><span><a>Animatable</a>:
	          yes.</span>
		 * 
		 * @return
		 */
		public native final String type() /*-{
			return this.type;
		}-*/;

		/**
		 * "identity | table | discrete | linear | gamma"
		 * <p>Indicates the type of component transfer function. The
	          type of function determines the applicability of the
	          other attributes.</p><p>In the following, C is the initial component (e.g.,
		  <a><span>‘feFuncR’</span></a>), C' is the remapped component; both
		  in the closed interval [0,1].</p><ul><li>
	              For <span>identity</span>: 
	<pre>C' = C
	</pre></li><li>
	              For <span>table</span>, the
	              function is defined by linear interpolation
		      between values given in the attribute
		      <a><span>‘tableValues’</span></a>. The table has <em>n+1</em>
		      values (i.e., v<sub>0</sub> to v<sub>n</sub>)
		      specifying the start and end values for <em>n</em>
		      evenly sized interpolation regions. Interpolations
		      use the following formula:

	              <p>For a value <code>C < 1</code> find <code>k</code>
	              such that:</p><p>k/n <= C < (k+1)/n</p><p>The result <code>C'</code> is given by:</p><p>C' = v<sub>k</sub> + (C -
	              k/n)*n * (v<sub>k+1</sub> - v<sub>k</sub>)</p><p>If <code>C = 1</code> then:</p><p>C' = v<sub>n</sub>.</p></li><li>
	              For <span>discrete</span>, the
	              function is defined by the step function given in the
	              attribute <a><span>‘tableValues’</span></a>, which
	              provides a list of <em>n</em> values (i.e.,
	              v<sub>0</sub> to v<sub>n-1</sub>) in order to
	              identify a step function consisting of <em>n</em>
	              steps. The step function is defined by the following
	              formula:

	              <p>For a value <code>C < 1</code> find <code>k</code>
	              such that:</p><p>k/n <= C < (k+1)/n</p><p>The result <code>C'</code> is given by:</p><p>C' = v<sub>k</sub></p><p>If <code>C = 1</code> then:</p><p>C' = v<sub>n-1</sub>.</p></li><li>
	              For <span>linear</span>, the
	              function is defined by the following linear equation:
	              
	              <p>C' = <a><span>slope</span></a> * C + <a><span>intercept</span></a></p></li><li>
	              For <span>gamma</span>, the
	              function is defined by the following exponential
	              function: 
	              <p>C' = <a><span>amplitude</span></a> * pow(C,
	              <a><span>exponent</span></a>) + <a><span>offset</span></a></p></li></ul><span><a>Animatable</a>:
	          yes.</span>
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function type(String val) /*-{
			this.type = val;
			return this;
		}-*/;

		/**
		 * When type="table", the list of <number>s v0,v1,...vn, separated by white space and/or a comma, which define the lookup table. An empty list results in an identity transfer
		 * function. If the attribute is not specified, then the effect is as if an empty list were provided.
		 * 
		 * @return
		 */
		public native final String tableValues() /*-{
			return this.tableValues;
		}-*/;

		/**
		 * When type="table", the list of <number>s v0,v1,...vn, separated by white space and/or a comma, which define the lookup table. An empty list results in an identity transfer
		 * function. If the attribute is not specified, then the effect is as if an empty list were provided.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function tableValues(String val) /*-{
			this.tableValues = val;
			return this;
		}-*/;

		/**
		 * When type="linear", the slope of the linear function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @return
		 */
		public native final double slope() /*-{
			return this.slope;
		}-*/;

		/**
		 * When type="linear", the slope of the linear function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function slope(double val) /*-{
			this.slope = val;
			return this;
		}-*/;

		/**
		 * When type="linear", the intercept of the linear function. If the attribute is not specified, then the effect is as if a value of 0 were specified.
		 * 
		 * @return
		 */
		public native final double intercept() /*-{
			return this.intercept;
		}-*/;

		/**
		 * When type="linear", the intercept of the linear function. If the attribute is not specified, then the effect is as if a value of 0 were specified.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function intercept(double val) /*-{
			this.intercept = val;
			return this;
		}-*/;

		/**
		 * When type="gamma", the amplitude of the gamma function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @return
		 */
		public native final double amplitude() /*-{
			return this.amplitude;
		}-*/;

		/**
		 * When type="gamma", the amplitude of the gamma function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function amplitude(double val) /*-{
			this.amplitude = val;
			return this;
		}-*/;

		/**
		 * When type="gamma", the exponent of the gamma function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @return
		 */
		public native final double exponent() /*-{
			return this.exponent;
		}-*/;

		/**
		 * When type="gamma", the exponent of the gamma function. If the attribute is not specified, then the effect is as if a value of 1 were specified.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function exponent(double val) /*-{
			this.exponent = val;
			return this;
		}-*/;

		/**
		 * When type="gamma", the offset of the gamma function. If the attribute is not specified, then the effect is as if a value of 0 were specified.
		 * 
		 * @return
		 */
		public native final double offset() /*-{
			return this.offset;
		}-*/;

		/**
		 * When type="gamma", the offset of the gamma function. If the attribute is not specified, then the effect is as if a value of 0 were specified.
		 * 
		 * @param val
		 * @return this - for setter chaining
		 */
		public native final Function offset(double val) /*-{
			this.offset = val;
			return this;
		}-*/;

	}
}

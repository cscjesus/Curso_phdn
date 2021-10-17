<%-- 
    Document   : home
    Created on : 7 oct 2021, 19:40:11
    Author     : Lichi
--%>
<jsp:include page="head.jsp" flush="true"/>

<!--div class="sheetSlider sh-default"-->

<div class="sheetSlider sh-default sh-auto">
    <input id="s1" type="radio" name="slide1" checked/> 
    <input id="s2" type="radio" name="slide1"/>
    <input id="s3" type="radio" name="slide1"/>
    <input id="s4" type="radio" name="slide1"/>
    <input id="s5" type="radio" name="slide1"/>
    <input id="s6" type="radio" name="slide1"/>
    <input id="s7" type="radio" name="slide1"/>
    <input id="s8" type="radio" name="slide1"/>
    <input id="s9" type="radio" name="slide1"/>
    <input id="s10" type="radio" name="slide1"/>
    <div class="sh__content">
        <!-- imagen 1-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura1.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>Dart and flutter desde cero</h4>  
                <span>
                    <a href="www.google.com">curso 1</a>
                </span>
            </div>
        </div>

        <!-- imagen 2-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura2.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 2 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 2</a>
                </span>
            </div>
        </div>
        <!-- imagen 3-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura3.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 3 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 3</a>
                </span>
            </div>
        </div>
        <!-- imagen 4-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura4.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 4 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 4</a>
                </span>
            </div>
        </div>
        <!-- imagen 5-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura5.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 5 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 5</a>
                </span>
            </div>
        </div>
        <!-- imagen 6-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura6.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 6 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 6</a>
                </span>
            </div>
        </div>
        <!-- imagen 7-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura7.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 7 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 7</a>
                </span>
            </div>
        </div>
        <!-- imagen 8-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura8.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 8 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 8</a>
                </span>
            </div>
        </div>
        <!-- imagen 9-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura9.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 9 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 9</a>
                </span>
            </div>
        </div>
        <!-- imagen 10-->
        <div class="sh__item">
            <img src="${pageContext.request.contextPath}/resource/images/captura10.png"
                 alt="imgText" class="imgSlider"/>
            <div class="sh__meta">
                <h4>curso 10 desde cero hasta experto</h4>  
                <span>
                    <a href="www.google.com">curso 10</a>
                </span>
            </div>
        </div>

        <!--div class="sh__item"><img src="img/img02.jpg"/></div-->
    </div>
    <div class="sh__btns">
        <label for="s1"></label>
        <label for="s2"></label>
        <label for="s3"></label>
        <label for="s4"></label>
        <label for="s5"></label>
        <label for="s6"></label>
        <label for="s7"></label>
        <label for="s8"></label>
        <label for="s9"></label>
        <label for="s10"></label>
    </div>
    <div class="sh__arrows">
        <label for="s1"></label>
        <label for="s2"></label>
        <label for="s3"></label>
        <label for="s4"></label>
        <label for="s5"></label>
        <label for="s6"></label>
        <label for="s7"></label>
        <label for="s8"></label>
        <label for="s9"></label>
        <label for="s10"></label>
    </div>
                 <!--button class="sh-control"></button-->
</div> 

            
            
            
<jsp:include page="footer.jsp" flush="true"/>